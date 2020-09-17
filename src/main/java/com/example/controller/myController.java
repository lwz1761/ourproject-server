package com.example.controller;


import com.example.Service.userService;

import com.example.dto.JsonResult;
import com.example.dto.currentPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/myController")
public class myController {

    @Autowired(required = false)
    userService service;

    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @GetMapping("/getAllUser")
    public JsonResult getAllUser(currentPage currentPage){
        System.out.println(currentPage.getCurrentPage());
        return service.getAllUser(currentPage);
    }

    @GetMapping("/deleteUserById")
    public JsonResult deleteUserById(String id){
        JsonResult jsonResult = new JsonResult();
        if(service.deleteByPrimaryKey(id)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("删除成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("删除失败");
        }
        return jsonResult;
    }


}
