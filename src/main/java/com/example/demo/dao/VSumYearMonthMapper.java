package com.example.demo.dao;

import com.example.demo.entity.VSumYearMonth;
import com.example.demo.entity.VSumYearMonthExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VSumYearMonthMapper {
    long countByExample(VSumYearMonthExample example);

    int deleteByExample(VSumYearMonthExample example);

    int insert(VSumYearMonth record);

    int insertSelective(VSumYearMonth record);

    List<VSumYearMonth> selectByExample(VSumYearMonthExample example);

    int updateByExampleSelective(@Param("record") VSumYearMonth record, @Param("example") VSumYearMonthExample example);

    int updateByExample(@Param("record") VSumYearMonth record, @Param("example") VSumYearMonthExample example);
}
