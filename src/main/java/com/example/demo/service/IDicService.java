package com.example.demo.service;

import java.util.List;

import com.example.demo.ventity.VDic;

public interface IDicService{
	List<VDic> selectVDic(String tableName,String fieldName);

}
