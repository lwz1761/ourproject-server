package com.example.dao;

import com.example.entity.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface loginMapper {
    user login(String username);
    int rigster(user user);
}
