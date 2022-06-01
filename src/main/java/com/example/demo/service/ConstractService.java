package com.example.demo.service;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.dao.CPayMapper;
import com.example.demo.entity.CPay;
import com.example.demo.entity.CPayExample;
import com.example.demo.ventity.ConstractPagedData;
import com.example.demo.ventity.VMoneyAmount;
import com.example.demo.ventity.VMoneyAmountStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CConstractMapper;
import com.example.demo.entity.CConstract;
import com.example.demo.entity.CConstractExample;
import com.example.demo.entity.CConstractExample.Criteria;
import com.example.demo.params.ConstractSearchParam;
import com.example.demo.ventity.VConstract;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class ConstractService implements IConstractService {
	@Autowired
	private CConstractMapper cmapper;
	@Autowired
	private CPayMapper cpaymapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public Map<String, Boolean> addOrUpdateConstract(CConstract recored) {
		Map<String, Boolean> map = new HashMap<>();
		map.put("success", false);
		if (recored.getId() <= 0) {
			int count = this.cmapper.insertSelective(recored);
			if (count > 0) {
				List<CPay> pays = recored.getPays();
				for (CPay pay : pays) {
					pay.setConstractid(recored.getId());
					pay.setAmount(setPayAmount(pay,recored));
					this.cpaymapper.insertSelective(pay);
				}
				map.put("success", true);
			}
		} else {
			this.cmapper.updateByPrimaryKeySelective(recored);
			List<CPay> dbpays = this.selectPaysByConstractId(recored.getId());
			List<CPay> vpays = recored.getPays();
			for (CPay vpay : vpays) {
				CPay _pay = dbpays.stream().filter(dbpay -> dbpay.getMilestone() == vpay.getMilestone()).findFirst().orElse(null);
				if (_pay != null) {
					//更新
					_pay.setPercentage(vpay.getPercentage());
					_pay.setAmount(setPayAmount(_pay,recored));
					this.cpaymapper.updateByPrimaryKeySelective(_pay);
				} else {
					//新增
					vpay.setConstractid(recored.getId());
					vpay.setAmount(setPayAmount(vpay,recored));
					this.cpaymapper.insert(vpay);
				}
			}
			for (CPay dbpay : dbpays) {
				CPay _dbpay = vpays.stream().filter(vpay -> vpay.getMilestone() == dbpay.getMilestone()).findFirst().orElse(null);
				if(_dbpay == null){
					//删除
					this.cpaymapper.deleteByPrimaryKey(dbpay.getId());
				}
			}
			map.put("success", true);
		}
		return map;
	}

	private BigDecimal setPayAmount(CPay pay,CConstract recored){
		BigDecimal bp = new BigDecimal(pay.getPercentage());
		bp = bp.divide(new BigDecimal(100));
		BigDecimal amount = recored.getAmount().multiply(bp);
		return amount.setScale(2,BigDecimal.ROUND_HALF_DOWN);
	}

	private List<CPay> selectPaysByConstractId(int constractId){
		CPayExample example = new CPayExample();
		example.createCriteria().andConstractidEqualTo(constractId);
		List<CPay> dbpays = this.cpaymapper.selectByExample(example);
		return dbpays;
	}


//	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
//	@Override
//	public ConstractPagedData list(ConstractSearchParam params,int currentPage,int pageSize) {
//		CConstractExample example = new CConstractExample();
//		Criteria c = example.createCriteria();
//		c.andNameLike(params.getName());
//		c.andCodeLike(params.getCode());
//		if (params.getName()!=null){
//			c.andNameLike(params.getName());
//		}
//		if (params.getCode()!=null){
//			c.andCodeLike(params.getCode());
//		}
//		if(params.getYear()>0) {
//			c.andYearEqualTo(params.getYear());
//		}
//		if(params.getClient()>0) {
//			c.andClientEqualTo(params.getClient());
//		}
//		if(params.getState()>0) {
//			c.andStateEqualTo(params.getState());
//		}
//		Page<VConstract> pages = PageHelper.startPage(currentPage, pageSize, true)
//				.doSelectPage(()->this.cmapper.selectByExample(example));
//
//		VMoneyAmount ma = this.cmapper.selectSumAmount();
//		ma  = ma == null?new VMoneyAmount():ma;
//		BigDecimal tempAmount = new BigDecimal(0);
//		BigDecimal tempCrediting = new BigDecimal(0);
//
//		for (VConstract vc:pages){
//			tempAmount = tempAmount.add(vc.getAmount());
//			tempCrediting = tempCrediting.add(vc.getCrediting());
//		}
//		tempAmount.setScale(2,BigDecimal.ROUND_DOWN);
//		tempCrediting.setScale(2,BigDecimal.ROUND_DOWN);
//
//		ma.setCurrentPageAmount(tempAmount);
//		ma.setCurrentPageCrediting(tempCrediting);
//
//		NumberFormat currency = NumberFormat.getCurrencyInstance();
//		//String str = currency.format(ma.getAmount());
//
//		VMoneyAmountStr ma1 = new VMoneyAmountStr();
//		ma1.setAmount(currency.format(ma.getAmount()));
//		ma1.setCrediting(currency.format(ma.getCrediting()));
//		ma1.setCurrentPageAmount(currency.format(ma.getCurrentPageAmount()));
//		ma1.setCurrentPageCrediting(currency.format(ma.getCurrentPageCrediting()));
//
//		PageInfo<VConstract> pi = new PageInfo<>(pages);
//
//		ConstractPagedData cpd = new ConstractPagedData(pi,ma);
//
//		return cpd;
//	}

	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	@Override
	public ConstractPagedData list(ConstractSearchParam params,int currentPage,int pageSize) {
		CConstractExample example = new CConstractExample();
		Criteria c = example.createCriteria();

		c.andNameLike(params.getName());
		if(params.getCode() != null) {
			c.andCodeLike(params.getCode());
		}

		if(params.getYear()>0) {
			c.andYearGreaterThanOrEqualTo(params.getYear());
		}
		if(params.getClient()>0) {
			c.andClientEqualTo(params.getClient());
		}
		if(params.getState()>0) {
			c.andStateEqualTo(params.getState());
		}
		Page<VConstract> pages = PageHelper.startPage(currentPage, pageSize, true)
				.doSelectPage(()->this.cmapper.selectByExample(example));

		VMoneyAmount ma=this.cmapper.selectSumAmount();
		ma = ma ==null?new VMoneyAmount():ma;

		BigDecimal tempAmount=new BigDecimal(0);
		BigDecimal tempCrediting=new BigDecimal(0);
		for(VConstract vc:pages) {
			tempAmount=tempAmount.add(vc.getAmount());
			tempCrediting=tempCrediting.add(vc.getCrediting());
		}
		tempAmount.setScale(2,BigDecimal.ROUND_DOWN);
		tempCrediting.setScale(2,BigDecimal.ROUND_DOWN);
		ma.setCurrentPageAmount(tempAmount);
		ma.setCurrentPageCrediting(tempCrediting);

		PageInfo<VConstract> pi=new PageInfo<>(pages);
		ConstractPagedData cpd=new ConstractPagedData(pi,ma);
		return cpd;
	}



	@Override
	public CConstract queryById(int id) {
		CConstract constract = this.cmapper.selectByPrimaryKey(id);
		CPayExample payExample = new CPayExample();
		payExample.createCriteria().andConstractidEqualTo(id);
		List<CPay> pays = this.cpaymapper.selectByExample(payExample);
		constract.getPays().addAll(pays);
		return constract;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void deleteConstractById(int id) {
		this.cmapper.deleteByPrimaryKey(id);
	}


}
