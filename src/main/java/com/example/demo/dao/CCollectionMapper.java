package com.example.demo.dao;

import com.example.demo.entity.CCollection;
import com.example.demo.entity.CCollectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CCollectionMapper {
    long countByExample(CCollectionExample example);

    int deleteByExample(CCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CCollection record);

    int insertSelective(CCollection record);

    List<CCollection> selectByExample(CCollectionExample example);

    CCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CCollection record, @Param("example") CCollectionExample example);

    int updateByExample(@Param("record") CCollection record, @Param("example") CCollectionExample example);

    int updateByPrimaryKeySelective(CCollection record);

    int updateByPrimaryKey(CCollection record);
}
