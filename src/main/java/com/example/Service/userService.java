package com.example.Service;

import com.example.dto.JsonResult;
import com.example.dto.PageResult;
import com.example.dto.currentPage;
import com.example.dto.userQueryDTO;
import com.example.entity.user;

import java.util.List;
import java.util.Map;


public interface userService {

        int deleteByPrimaryKey(String[] ids);

        int insert(user record);

        int insertSelective(user record);

        user selectByPrimaryKey(String id);

        int updateByPrimaryKeySelective(user record);

        int updateByPrimaryKey(user record);

        PageResult<user> getUserList(userQueryDTO record);

        List<user> selectByUserName(Map<String,String> map);//判断用户名重复

}
