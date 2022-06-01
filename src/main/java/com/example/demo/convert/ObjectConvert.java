package com.example.demo.convert;

import com.example.demo.annotation.DicLable;
import com.example.demo.dao.CDicMapper;
import com.example.demo.entity.CDic;
import com.example.demo.entity.CDicExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
@Component
public class ObjectConvert {
    @Autowired
    private CDicMapper dicMapper;

    public void convert(Object sourceObj,Object targetObj) throws Exception {
        Field[] fields = targetObj.getClass().getDeclaredFields();
        for(Field field:fields){
            DicLable dl = field.getAnnotation(DicLable.class);
            String proName = field.getName();
            String proGetName = "get" + proName.substring(0,1).toUpperCase()+proName.substring(1);
            Method getMethod = sourceObj.getClass().getDeclaredMethod(proGetName,null);
            Object value = getMethod.invoke(sourceObj);
            String proSetName = "set" + proName.substring(0,1).toUpperCase()+proName.substring(1);
            if(dl != null){
                String tableName = dl.tableName();
                String fieldName = dl.fieldName();
                String des = this.getDes(tableName,fieldName,(byte)value);
                Method setMethod = targetObj.getClass().getDeclaredMethod(proSetName,String.class);
                setMethod.invoke(targetObj,des);
                continue;
            }
            Class parameterCls = field.getType();
            Method setMethod = targetObj.getClass().getDeclaredMethod(proSetName,parameterCls);
            setMethod.invoke(targetObj,value);
        }

    }

    private String getDes(String tableName,String fieldName,byte value){
        CDicExample dicEx = new CDicExample();
        dicEx.createCriteria().andTablenameEqualTo(tableName).andFieldnameEqualTo(fieldName).andValueEqualTo(value);
        List<CDic> dics = dicMapper.selectByExample(dicEx);
        if(dics == null || dics.isEmpty()){
            return  "";
        }

        return  dics.get(0).getDes();
    }
}
