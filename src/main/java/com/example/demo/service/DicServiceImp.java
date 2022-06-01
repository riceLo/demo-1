package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CDicMapper;
import com.example.demo.ventity.VDic;
@Service
public class DicServiceImp implements IDicService{
	
	@Autowired
	public CDicMapper dicMapping;

	@Override
	public List<VDic> selectVDic(String tableName, String fieldName) {
		
		return this.dicMapping.selectVDic(tableName, fieldName);
	}

}
