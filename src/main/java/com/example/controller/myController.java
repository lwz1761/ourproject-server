package com.example.controller;

import com.example.Service.audioConfigService;
import com.example.Service.commentsService;
import com.example.Service.userService;
import com.example.dto.JsonResult;
import com.example.dto.currentPage;
import com.example.entity.audioConfig;
import com.example.entity.comments;
import com.example.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/myController")
public class myController {

    @Autowired(required = false)
    audioConfigService audioConfigService;

    @Autowired(required = false)
    commentsService commentsService;

    @Autowired(required = false)
    userService userService;

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

    @GetMapping("/selectByPrimaryKey") //初始化页面调用的接口
    @ResponseBody
    public user selectByPrimaryKey(String id){
        System.out.println("哈哈");
        user user = userService.selectByPrimaryKey(id);
        return user;
    }

    @PostMapping("/updateByPrimaryKeySelective")//更新数据（修改个人信息，上传头像保存到数据库）调用的接口
    @ResponseBody
    public String updateByPrimaryKeySelective(user user){
        System.out.println(user.getUserName());
        System.out.println(user.getUserID());
        Map<String,String> map = new HashMap<>();
        System.out.println(user.getUserID());
        System.out.println(user.getUserName());
        map.put("username",user.getUserName());
        map.put("userid",user.getUserID());
        List<user> users=userService.selectByUserName(map);//判断用户名是否重复
        if(users.size()!=0)
            return "defact";
        userService.updateByPrimaryKeySelective(user);
        return "success";
    }

}
