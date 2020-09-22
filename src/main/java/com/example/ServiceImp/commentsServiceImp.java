package com.example.ServiceImp;

import com.example.Service.commentsService;
import com.example.dao.commentsMapper;
import com.example.dto.JsonResult;
import com.example.dto.PageResult;
import com.example.dto.commentsDto;
import com.example.dto.currentPage;
import com.example.entity.comments;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public JsonResult getCommentByUserId(String userId, currentPage currentPage) {
        PageHelper.startPage(currentPage.getCurrentPage(),currentPage.getPageSize());
        List<commentsDto> commentsLists = mapper.getCommentByUserId(userId);

        PageInfo<commentsDto> pageInfo = new PageInfo<>(commentsLists);

        PageResult<commentsDto> result = new PageResult<>();

        result.setTotal((int)pageInfo.getTotal());

        result.setList(commentsLists);

        JsonResult jsonResult = new JsonResult(result);

        jsonResult.setMessage("查询成功");

        return jsonResult;

    }

    @Override
    public int insert(comments record) {
        return 0;
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
}
