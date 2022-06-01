package com.example.demo.service;

import com.example.demo.constroller.AttachmentController;
import com.example.demo.entity.CAttachmentExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CAttachmentMapper;
import com.example.demo.entity.CAttachment;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

@Service
public class AttachmentService implements IAttachmentService {

	static Logger logger = LoggerFactory.getLogger(AttachmentService.class);

	@Autowired
	private CAttachmentMapper am;

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void addFileIntoToDB(CAttachment attachment) {
		this.am.insert(attachment);
	}

	@Override
	public List<CAttachment> list(int constractId) {
		CAttachmentExample ce = new CAttachmentExample();
		ce.createCriteria().andConstractidEqualTo(constractId);
		List<CAttachment> datas = am.selectByExample(ce);
		return datas;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void addFileIntoToDB(List<CAttachment> attachments) {
		this.am.batchInsert(attachments);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void deleteAttachment(int id) {
		CAttachment at = this.am.selectByPrimaryKey(id);
		this.am.deleteByPrimaryKey(id);
		try{
			Files.deleteIfExists(Paths.get(at.getFilepath()));
		}catch (IOException e){
			e.printStackTrace();
			logger.error("删除文件:"+at.getFilepath(),e.toString());
		}

	}

}
