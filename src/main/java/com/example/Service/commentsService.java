package com.example.Service;

import com.example.dto.CommentDTO;
import com.example.dto.JsonResult;
import com.example.dto.currentPage;
import com.example.entity.comments;

import java.util.List;

public interface commentsService {

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

    JsonResult getCommentByUserId(String userId, currentPage currentPage);
}
