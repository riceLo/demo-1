package com.example.demo.dao;

import com.example.demo.entity.CPay;
import com.example.demo.entity.CPayExample;
import java.util.List;

import com.example.demo.ventity.VPayMoneyAmount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CPayMapper {

    VPayMoneyAmount selectStatics(Integer constractId);

    long countByExample(CPayExample example);

    int deleteByExample(CPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CPay record);

    int insertSelective(CPay record);

    List<CPay> selectByExample(CPayExample example);

    CPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CPay record, @Param("example") CPayExample example);

    int updateByExample(@Param("record") CPay record, @Param("example") CPayExample example);

    int updateByPrimaryKeySelective(CPay record);

    int updateByPrimaryKey(CPay record);
}
