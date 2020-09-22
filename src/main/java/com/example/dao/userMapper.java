package com.example.dao;


import com.example.dto.PageResult;
import com.example.dto.currentPage;
import com.example.dto.userQueryDTO;
import com.example.entity.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {
    int deleteByPrimaryKey(String[] ids);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    List<user> getUserList(userQueryDTO record);
}