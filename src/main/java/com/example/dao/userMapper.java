package com.example.dao;


import com.example.dto.PageResult;
import com.example.dto.currentPage;
import com.example.dto.userQueryDTO;
import com.example.entity.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface userMapper {
    int deleteByPrimaryKey(String[] ids);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(@RequestParam("id")String id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    List<user> getUserList(userQueryDTO record);

    List<user> selectByUserName(Map<String,String> map);//判断用户名重复
}