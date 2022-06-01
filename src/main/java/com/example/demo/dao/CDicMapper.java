package com.example.demo.dao;

import com.example.demo.entity.CDic;
import com.example.demo.entity.CDicExample;
import com.example.demo.ventity.VDic;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CDicMapper {
	List<VDic> selectVDic(String tableName,String fieldName);

    long countByExample(CDicExample example);

    int deleteByExample(CDicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CDic record);

    int insertSelective(CDic record);

    List<CDic> selectByExample(CDicExample example);

    CDic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CDic record, @Param("example") CDicExample example);

    int updateByExample(@Param("record") CDic record, @Param("example") CDicExample example);

    int updateByPrimaryKeySelective(CDic record);

    int updateByPrimaryKey(CDic record);
}
