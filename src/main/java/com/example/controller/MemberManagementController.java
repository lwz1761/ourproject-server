package com.example.controller;

import com.example.Service.userService;
import com.example.dto.JsonResult;
import com.example.dto.userQueryDTO;
import com.example.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/userController")
public class MemberManagementController {
    @Autowired(required = false)
    userService userService;

    @PostMapping("/getUserList")
    public JsonResult getUserList(@Validated @RequestBody userQueryDTO record){
        JsonResult jsonResult = new JsonResult(userService.getUserList(record));
        if(jsonResult.getData() == null){
            jsonResult.setMessage("获取用户列表失败");
            jsonResult.setCode(500);
        }
        else
            jsonResult.setMessage("获取用户列表成功");
        return jsonResult;
    }

    @PostMapping("/updateByPrimaryKey")
    public JsonResult updateByPrimaryKey(@Validated @RequestBody user record){
        JsonResult jsonResult = new JsonResult();
        if(userService.updateByPrimaryKey(record) == 0){
            jsonResult.setMessage("修改用户信息失败");
            jsonResult.setCode(500);
        }else {
            jsonResult.setMessage("修改用户信息成功");
            jsonResult.setCode(200);
        }
        return jsonResult;
    }

    @PostMapping("/deleteByPrimaryKey")
    public JsonResult deleteByPrimaryKey(@Validated @RequestBody String[] ids){
        JsonResult jsonResult = new JsonResult();
        for(int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
        }
        if(userService.deleteByPrimaryKey(ids) == 0){
            jsonResult.setMessage("删除用户信息失败");
            jsonResult.setCode(500);
        }else{
            jsonResult.setMessage("删除用户信息成功");
            jsonResult.setCode(200);
        }
        return jsonResult;
    }
}
