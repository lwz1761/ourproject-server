package com.example.dao;


import com.example.dto.currentPage;
import com.example.entity.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {
    int deleteByPrimaryKey(String id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    List<user> getAllUser(currentPage currentPage);
}