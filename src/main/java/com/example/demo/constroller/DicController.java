package com.example.demo.constroller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IDicService;
import com.example.demo.ventity.VDic;

@RestController
@RequestMapping("api/dic")
public class DicController {

	@Autowired
	private IDicService dicService;

	@GetMapping("/listDicByParam")
	public List<VDic> selectVDIC(@Param("tableName") String tableName, @Param("fieldName")String fieldName){
		List<VDic> datas = this.dicService.selectVDic(tableName,fieldName);
		VDic vdic = new VDic((byte)-1,"全部");
		datas.add(vdic);
		return datas;
	}

}
