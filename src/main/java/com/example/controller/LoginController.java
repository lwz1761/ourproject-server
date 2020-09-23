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

    @RequestMapping("/Login")
    @ResponseBody
    public int Login(String username, String password){
        System.out.println(username+"   "+ password);
        int user=loginService.Login(username,password);
        return user;
    }
    @RequestMapping("/Login1")
    @ResponseBody
    public String Login(){

        return "pyy";
    }
}
