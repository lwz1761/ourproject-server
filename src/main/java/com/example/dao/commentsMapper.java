package com.example.dao;

import com.example.dto.CommentDTO;
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

//    文章前五条热门评论
    List<CommentDTO> hotCommentList(String record);
//    文章最新评论
    List<CommentDTO> newCommentList(String record);

    List<commentsDto> getCommentByUserId(String userId);
}