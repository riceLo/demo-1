package com.example.demo.dao;

import com.example.demo.entity.VConstractAmount;
import com.example.demo.entity.VConstractAmountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VConstractAmountMapper {
    long countByExample(VConstractAmountExample example);

    int deleteByExample(VConstractAmountExample example);

    int insert(VConstractAmount record);

    int insertSelective(VConstractAmount record);

    List<VConstractAmount> selectByExample(VConstractAmountExample example);

    int updateByExampleSelective(@Param("record") VConstractAmount record, @Param("example") VConstractAmountExample example);

    int updateByExample(@Param("record") VConstractAmount record, @Param("example") VConstractAmountExample example);
}
