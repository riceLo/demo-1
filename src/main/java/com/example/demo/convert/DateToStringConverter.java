package com.example.demo.convert;
import org.springframework.core.convert.converter.Converter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringConverter implements Converter<Date,String> {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
    @Override
    public String convert(Date source) {
        if(source==null){
            return "";
        }
        return  sdf.format(source);
    }


}
