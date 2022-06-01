package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SystemExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String,Object> exceptionHandler(Exception ex){
		Map<String,Object> map = new HashMap<>();
		map.put("success", false);
		map.put("msg", ex.toString());
		return map;
	}
}
