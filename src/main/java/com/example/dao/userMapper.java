package com.example.dao;

import com.example.entity.user;

public interface userMapper {
    int deleteByPrimaryKey(String userid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}