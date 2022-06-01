package com.example.demo.dao;

import com.example.demo.entity.CStaff;
import com.example.demo.entity.CStaffExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CStaffMapper {
    long countByExample(CStaffExample example);

    int deleteByExample(CStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CStaff record);

    int insertSelective(CStaff record);

    List<CStaff> selectByExample(CStaffExample example);

    CStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CStaff record, @Param("example") CStaffExample example);

    int updateByExample(@Param("record") CStaff record, @Param("example") CStaffExample example);

    int updateByPrimaryKeySelective(CStaff record);

    int updateByPrimaryKey(CStaff record);
}
