package com.example.demo.dao;



import java.math.BigDecimal;
import java.util.List;

import com.example.demo.ventity.VMoneyAmount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.CConstract;
import com.example.demo.entity.CConstractExample;
import com.example.demo.ventity.VConstract;
@Mapper
public interface CConstractMapper {

    VMoneyAmount selectSumAmount();

    long countByExample(CConstractExample example);

    int deleteByExample(CConstractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CConstract record);

    int insertSelective(CConstract record);

    List<VConstract> selectByExample(CConstractExample example);

    CConstract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CConstract record, @Param("example") CConstractExample example);

    int updateByExample(@Param("record") CConstract record, @Param("example") CConstractExample example);

    int updateByPrimaryKeySelective(CConstract record);

    int updateByPrimaryKey(CConstract record);
}
