package com.example.controller;

import com.example.Service.audioConfigService;
import com.example.Service.commentsService;
import com.example.dto.JsonResult;
import com.example.dto.currentPage;
import com.example.entity.audioConfig;
import com.example.entity.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/myController")
public class myController {

    @Autowired(required = false)
    audioConfigService audioConfigService;

    @Autowired(required = false)
    commentsService commentsService;

    @GetMapping("/getConfig")
    public audioConfig getConfig(String userId){

        return audioConfigService.getConfigById(userId);
    }

    @PostMapping("/setConfig")
    public int setConfig(@Validated @RequestBody audioConfig record){
        System.out.println(record.getUserid());
        return audioConfigService.setConfigById(record);
    }

    @GetMapping("/deleteCommentsByPrimaryKey")
    public int deleteCommentsByPrimaryKey(String commentid){

        return commentsService.deleteByPrimaryKey(commentid);
    }

    @PostMapping("/updateComments")
    public int updateComments(@Validated @RequestBody comments record){

        return commentsService.updateByPrimaryKeySelective(record);
    }

    @GetMapping("/getCommentByUserId")
    public JsonResult getCommentByUserId(@RequestParam("userId") String userId, @RequestParam("currentPage")int currentPage, @RequestParam("pageSize")int pageSize){

        currentPage currentPage1 = new currentPage();
        currentPage1.setCurrentPage(currentPage);;
        currentPage1.setPageSize(pageSize);
        return commentsService.getCommentByUserId(userId,currentPage1);

    }
}
