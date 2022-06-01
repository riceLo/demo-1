package com.example.demo.constroller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.sun.xml.internal.ws.api.message.Attachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.CAttachment;
import com.example.demo.service.IAttachmentService;

//
//@Controller
//@ResponseBody

@RestController
@RequestMapping("api/attachment")
public class AttachmentController {


	@Value("${fileuploadpath}")
	private String fileuploadpath;

	@Value("${contextpath}")
	private String contextpath;

	@Value("${url}")
	private String url;

	@Autowired
	private IAttachmentService service;

	static Logger logger = LoggerFactory.getLogger(AttachmentController.class);
	@PostMapping("upload")
	public Map<String,Object>douploadFile(@RequestParam("constractId")int constractId,@RequestParam("file")MultipartFile file) throws IOException{
		String oriName = file.getOriginalFilename();
		long currentTime = System.currentTimeMillis();
		String extention = oriName.substring(oriName.lastIndexOf("."));
		String newFileName = currentTime+extention;
		String realPath = fileuploadpath;
		File u = new File(realPath);
		if(!u.exists()) {
			u.mkdirs();
		}
		realPath += File.separator+newFileName;
		String contextPath1 = contextpath+newFileName;
		System.out.println("===========contextpath==============");
		File destPath = new File(realPath);
		Map<String,Object> map = new HashMap<>();
		try {
			file.transferTo(destPath);
			CAttachment attachment = new CAttachment();
			attachment.setName(oriName);
			attachment.setFilecontextpath(url+contextPath1);
			attachment.setFilepath(realPath);
			attachment.setConstractid(constractId);
			attachment.setUploaddate(new Date());
			service.addFileIntoToDB(attachment);
			map.put("success", true);
			map.put("msg", "操作成功");
			map.put("attachment",attachment);
		}catch(IllegalStateException |IOException e) {
			e.printStackTrace();
			logger.error("上传文件错误",e.toString());
			map.put("error", false);
			map.put("msg", "上传失败!");
		}catch(DataAccessException e) {
			Files.deleteIfExists(Paths.get(destPath.getPath()));
		}
		return map;
	}

	@PostMapping("uploads")
	public Map<String,Object>douploadFiles(@RequestParam("constractId")int constractId,

										  @RequestParam("file")MultipartFile[] file) throws IOException{
		List<CAttachment> attachments = new ArrayList<>();
		Map<String,Object> map = new HashMap<>();
		try {
			for(MultipartFile f: file){
				String oriName = f.getOriginalFilename();
				long currentTime = System.currentTimeMillis();
				String extention = oriName.substring(oriName.lastIndexOf("."));
				String newFileName = currentTime+extention;//新文件名称
				String realPath = fileuploadpath;
				File u = new File(realPath);
				if(!u.exists()) {
					u.mkdirs();
				}
				realPath += File.separator+newFileName;
				String contextPath1 = contextpath+newFileName;
				File destPath = new File(realPath);
				f.transferTo(destPath);
				CAttachment attachment = new CAttachment();
				attachment.setName(oriName);
				attachment.setFilecontextpath(url+contextPath1);
				attachment.setFilepath(realPath);
				attachment.setConstractid(constractId);
				attachment.setUploaddate(new Date());
				attachments.add(attachment);
			}
			this.service.addFileIntoToDB(attachments);
			map.put("success", true);
			map.put("msg", "操作成功");
		}catch(IllegalStateException |IOException e) {
			e.printStackTrace();
			logger.error("上传文件错误",e.toString());
			deleteFiles(attachments);
			map.put("success", false);
			map.put("msg", "上传失败!");
	}catch(DataAccessException e) {
			e.printStackTrace();
			logger.error("上传文件错误",e.toString());
			deleteFiles(attachments);
			map.put("success", false);
			map.put("msg", "上传失败!");
	}catch (Exception e){
			logger.error("上传文件错误",e.toString());
			deleteFiles(attachments);
			map.put("success", false);
			map.put("msg", "上传失败!");
		}
		return map;
	}


	private void deleteFiles(List<CAttachment> attachments){
		for(CAttachment at:attachments){
			try{
				Files.deleteIfExists(Paths.get(at.getFilepath()));
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}

	@GetMapping("ListAttachments")
	public List<CAttachment> List(@RequestParam("constractId")int constractId){
		return this.service.list(constractId);
	}

	@GetMapping("/delete/{id}")
	public Map<String,Object> deleteAttachment(@PathVariable int id){
		this.service.deleteAttachment(id);
		Map<String,Object> map = new HashMap<>();
		map.put("success",true);
		map.put("msg","删除成功");
		return map;
	}
}
