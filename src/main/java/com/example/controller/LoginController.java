package com.example.controller;

import com.example.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Service.loginService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/LoginController")
public class LoginController {


    @Autowired(required = false)
    loginService  loginService;

    @PostMapping("/Login")
    @ResponseBody
    public int Login(@RequestBody user user){
        System.out.println(user.getUserName()+"   "+ user.getPassword());
        int user1=loginService.Login(user.getUserName(),user.getPassword());
        return user1;
    }
    @RequestMapping("/Login1")
    @ResponseBody
    public String Login(){

        return "pyy";
    }
}
