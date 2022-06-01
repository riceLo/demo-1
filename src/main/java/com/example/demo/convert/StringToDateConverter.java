package com.example.demo.convert;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.util.StringUtils;

public class StringToDateConverter implements ConverterFactory<String,Date>{

	@Override
	public <T extends Date> Converter<String, T> getConverter(Class<T> targetType) {
		// TODO Auto-generated method stub
		return null;
	}

}

class StringToDateConvert implements Converter<String,Date>{
	private SimpleDateFormat sdf = new SimpleDateFormat();

	@Override
	public Date convert(String source) {
		if(!StringUtils.hasLength(source)) {
			return new Date();
		}
		try {
			Date d = sdf.parse(source);
			return d;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Date();
	}

}

