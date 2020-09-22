package com.example.Service;

import com.example.dto.JsonResult;
import com.example.dto.commentsDto;
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

    JsonResult getCommentByUserId(String userId, currentPage currentPage);
}
