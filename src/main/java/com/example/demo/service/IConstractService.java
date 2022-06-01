package com.example.demo.service;

import java.util.Map;
import com.example.demo.entity.CConstract;
import com.example.demo.params.ConstractSearchParam;
import com.example.demo.ventity.ConstractPagedData;


public interface IConstractService {
	public Map<String,Boolean> addOrUpdateConstract(CConstract recored);
	public ConstractPagedData list(ConstractSearchParam params, int currentPage, int pageSize);
	public CConstract queryById(int id);
	public void deleteConstractById(int id);
}
