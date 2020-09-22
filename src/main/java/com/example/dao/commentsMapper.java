package com.example.dao;

import com.example.dto.commentsDto;
import com.example.entity.comments;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface commentsMapper {
    int deleteByPrimaryKey(String commentid);

    int insert(comments record);

    int insertSelective(comments record);

    comments selectByPrimaryKey(String commentid);

    int updateByPrimaryKeySelective(comments record);

    int updateByPrimaryKeyWithBLOBs(comments record);

    int updateByPrimaryKey(comments record);

    List<commentsDto> getCommentByUserId(String userId);
}