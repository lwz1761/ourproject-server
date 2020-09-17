package com.example.dao;

import com.example.entity.reply;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface replyMapper {
    int deleteByPrimaryKey(String id);

    int insert(reply record);

    int insertSelective(reply record);

    reply selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(reply record);

    int updateByPrimaryKey(reply record);
}