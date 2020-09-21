package com.example.dao;

import com.example.entity.comments;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface commentsMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(comments record);

    int insertSelective(comments record);

    comments selectByPrimaryKey(String commentid);

    int updateByPrimaryKeySelective(comments record);

    int updateByPrimaryKeyWithBLOBs(comments record);

    int updateByPrimaryKey(comments record);
}