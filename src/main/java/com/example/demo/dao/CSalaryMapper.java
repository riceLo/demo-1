package com.example.demo.dao;

import com.example.demo.entity.CSalary;
import com.example.demo.entity.CSalaryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CSalaryMapper {
    long countByExample(CSalaryExample example);

    int deleteByExample(CSalaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CSalary record);

    int insertSelective(CSalary record);

    List<CSalary> selectByExample(CSalaryExample example);

    CSalary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CSalary record, @Param("example") CSalaryExample example);

    int updateByExample(@Param("record") CSalary record, @Param("example") CSalaryExample example);

    int updateByPrimaryKeySelective(CSalary record);

    int updateByPrimaryKey(CSalary record);
}
