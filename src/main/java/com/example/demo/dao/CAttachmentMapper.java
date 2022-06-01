package com.example.demo.dao;

import com.example.demo.entity.CAttachment;
import com.example.demo.entity.CAttachmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CAttachmentMapper {
    long countByExample(CAttachmentExample example);

    int deleteByExample(CAttachmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CAttachment record);

    int insertSelective(CAttachment record);

    //一次插入多条记录
    void batchInsert(List<CAttachment>list);

    List<CAttachment> selectByExample(CAttachmentExample example);

    CAttachment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CAttachment record, @Param("example") CAttachmentExample example);

    int updateByExample(@Param("record") CAttachment record, @Param("example") CAttachmentExample example);

    int updateByPrimaryKeySelective(CAttachment record);

    int updateByPrimaryKey(CAttachment record);
}
