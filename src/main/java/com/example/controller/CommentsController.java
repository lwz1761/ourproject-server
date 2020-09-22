package com.example.controller;

import com.example.Service.commentsService;
import com.example.dto.CommentDTO;
import com.example.dto.JsonResult;
import com.example.entity.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/commentsController")
public class CommentsController {

    @Autowired(required = false)
    commentsService  commentsService;

    @GetMapping("/hotCommentList")
    public JsonResult hotCommentList(String record){
        JsonResult jsonResult = new JsonResult();
        List<CommentDTO> hotList = commentsService.hotCommentList(record);
        if(hotList==null){
            jsonResult.setMessage("获取热评失败");
            jsonResult.setCode(500);
        }else{
            jsonResult.setData(hotList);
            jsonResult.setMessage("获取热评成功");
            jsonResult.setCode(200);
        }
        return jsonResult;
    }

    @GetMapping("/newCommentList")
    public JsonResult newCommentList(String record){
        JsonResult jsonResult = new JsonResult();
        List<CommentDTO> hotList = commentsService.newCommentList(record);
        if(hotList==null){
            jsonResult.setMessage("获取最新评论失败");
            jsonResult.setCode(500);
        }else{
            jsonResult.setData(hotList);
            jsonResult.setMessage("获取最新评论成功");
            jsonResult.setCode(200);
        }
        return jsonResult;
    }

    @PostMapping("/insertComment")
    public JsonResult insertComment(@RequestBody @Validated comments record){
        System.out.println(record.getCommenttext());
        JsonResult jsonResult = new JsonResult();
        int flag = commentsService.insert(record);
        if(flag==0){
            jsonResult.setCode(500);
            jsonResult.setMessage("增加评论失败");
        }else{
            jsonResult.setCode(200);
            jsonResult.setMessage("增加评论成功");
        }
        return jsonResult;
    }
}
