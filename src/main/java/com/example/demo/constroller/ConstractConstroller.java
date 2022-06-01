package com.example.demo.constroller;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.ventity.ConstractPagedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CConstract;
import com.example.demo.params.ConstractSearchParam;
import com.example.demo.service.IConstractService;

//@EnableTransactionManagement
@RestController
@RequestMapping("api/constract")
public class ConstractConstroller {
	@Autowired
	private IConstractService cService;

	@PostMapping("add")
	public Map<String,Boolean> addOrUpdateConstract(@RequestBody CConstract constract){
		return this.cService.addOrUpdateConstract(constract);
	}

	@GetMapping("list")
	public ConstractPagedData listConstracts(@RequestParam(name="currentPage",required = true)int currentPage, @RequestParam(name="pageSize",required = true)int pageSize, ConstractSearchParam params){
		ConstractPagedData datas = this.cService.list(params,currentPage,pageSize);
		return datas;
	}

	@GetMapping("queryById")
	public  CConstract queryById(@RequestParam int id){
		return this.cService.queryById(id);
	}


	@GetMapping("/delete/{id}")
	public Map<String,Object> deleteById(@PathVariable int id){
		Map<String,Object> map = new HashMap<>();
		this.cService.deleteConstractById(id);
		map.put("success",true);
		return map;
	}





}
