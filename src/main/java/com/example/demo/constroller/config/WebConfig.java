package com.example.demo.constroller.config;

import com.example.demo.convert.DateToStringConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.convert.StringToDateConverter;
import com.example.demo.interator.LoginValidInterator;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Value("${fileuploadpath}")
	private String fileuploadpath;


	public void addFormatters(FormatterRegistry registry) {

		registry.addConverterFactory(new StringToDateConverter());
		registry.addConverter(new DateToStringConverter());
	}

	public void addResourceHandlers(ResourceHandlerRegistry registy) {
		System.out.println(this.fileuploadpath+"========");
		registy.addResourceHandler("/uploadFile/**","/excel/**").
		addResourceLocations("file:"+this.fileuploadpath);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new LoginValidInterator());
		//.excludePathPatterns("/login").addPathPatterns("/**");
	}

}
