package com.example.demo.constroller;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.alibaba.excel.EasyExcel;
import com.example.demo.dao.CDicMapper;
import com.example.demo.listener.ReadConstractExcelListener;
import com.example.demo.ventity.ConstractExcel;
import com.example.demo.ventity.ConstractPagedData;
import com.example.demo.ventity.ImportDataFromExcel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CConstract;
import com.example.demo.params.ConstractSearchParam;
import com.example.demo.service.IConstractService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/constract")

public class ConstractConstroller {

	@Value("${fileuploadpath}")
	private String uploadFilePath;

	@Value("${contextExcelPath}")
	private String contextExcelPath;

	@Value("${url}")
	private String url;

	@Autowired
	private IConstractService cService;

	@Autowired
	private CDicMapper dicMapper;


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

	@PostMapping("/import")
	public Map<String,Object> importFromExcel(@RequestParam("file") MultipartFile file) {
		Map<String,Object> map = new HashMap<>();
		try {

			ReadConstractExcelListener rcel = new ReadConstractExcelListener(this.cService,this.dicMapper);
			EasyExcel.read(file.getInputStream(),ConstractExcel.class,rcel).sheet().doRead();

			Map<String,String> savedFilePath = this.savaExcelFile(file);
			Map<Integer,String> errorMsg = rcel.getErrorMsg();
			Integer successCount = rcel.getSuccessCount();

//			System.out.println("=============");
//			System.out.println(successCount);
//			System.out.println(errorMsg);
//			System.out.println("=============");

			writeExcel(savedFilePath,errorMsg);
			/*
			* 返回相对路径
			* 成功多少条
			* 失败多少条
			*
			* */
			String contextPath = savedFilePath.get("contextPath");
			ImportDataFromExcel idf = new ImportDataFromExcel(contextPath,successCount.intValue(),errorMsg.keySet().size());

			map.put("success",true);
			map.put("data",idf);

		}catch (Exception e){
			e.printStackTrace();
			map.put("success",false);
			map.put("data","读取EXCEL文件出错");
		}

		return map;


	}


	private void writeExcel(Map<String,String> savedFilePath,Map<Integer,String> errorMsg) throws IOException {
		String realPath = savedFilePath.get("realPath");

		InputStream inputStream = new FileInputStream(realPath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Set<Integer> rowNumSet = errorMsg.keySet();
		for(Iterator<Integer> it = rowNumSet.iterator(); it.hasNext();) {
			Integer rowNum = it.next();
			String errMsg = errorMsg.get(rowNum);
			XSSFRow row = sheet.getRow(rowNum.intValue());
			int lastCellNum = row.getLastCellNum() + 2;

			XSSFCell lastCell = row.createCell(lastCellNum);
			System.out.println("=errMsg="+errMsg);
			lastCell.setCellValue(errMsg);


		}
		OutputStream os = new FileOutputStream(realPath);
		workbook.write(os);
		os.close();
		workbook.close();



	}

	private Map<String,String> savaExcelFile(MultipartFile file){
		String excelPath = uploadFilePath + "excel";
		Map<String,String> map = new HashMap<>();
		File f = new File(excelPath);
		if(!f.exists()){
			f.mkdirs();
		}
		String oriName = file.getOriginalFilename();
		long currentTime = System.currentTimeMillis();
		String extention = oriName.substring(oriName.lastIndexOf("."));
		String newFileName = currentTime+extention;//新文件名称
		excelPath = excelPath + File.separator + newFileName;
		try {
			file.transferTo(new File(excelPath));
			String contextPath1 = this.url + contextExcelPath + newFileName;
			map.put("realPath",excelPath);
			map.put("contextPath",contextPath1);
		} catch (IllegalStateException|IOException e) {
			e.printStackTrace();
		}
		return map;
	}




}
