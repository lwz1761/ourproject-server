package com.example.ServiceImp;

import com.example.Service.commentsService;
import com.example.config.Uuid;
import com.example.dao.commentsMapper;
import com.example.dto.CommentDTO;
import com.example.entity.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class commentsServiceImp implements commentsService {

    @Autowired(required = false)
    commentsMapper mapper;

    @Override
    public int deleteByPrimaryKey(String commentid) {
        return mapper.deleteByPrimaryKey(commentid);
    }

    @Override
    public int updateByPrimaryKeySelective(comments record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insert(comments record) {
        record.setCommentid(Uuid.getUuid());
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(comments record) {
        return 0;
    }

    @Override
    public comments selectByPrimaryKey(String commentid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(comments record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(comments record) {
        return 0;
    }

    @Override
    public List<CommentDTO> hotCommentList(String record) {
        return mapper.hotCommentList(record);
    }

    @Override
    public List<CommentDTO> newCommentList(String record) {
        return mapper.newCommentList(record);
    }

}
