package com.example.ServiceImp;

import com.example.Service.userService;
import com.example.dao.userMapper;
import com.example.dto.JsonResult;
import com.example.dto.PageResult;
import com.example.dto.currentPage;
import com.example.entity.user;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class userServiceImp implements userService {

    @Autowired(required = false)
    userMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public JsonResult getAllUser(currentPage currentPage) {
        PageHelper.startPage(currentPage.getCurrentPage(),currentPage.getPageSize());

        List<user> userList = userMapper.getAllUser(currentPage);

        PageInfo<user> pageInfo = new PageInfo<>(userList);

        PageResult<user> result = new PageResult<>();

        result.setTotal((int)pageInfo.getTotal());

        result.setList(userList);

        JsonResult jsonResult = new JsonResult(result);

        jsonResult.setMessage("查询成功");

        return jsonResult;

    }

    @Override
    public int insert(user record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(user record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public user selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(user record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(user record) {
        return userMapper.updateByPrimaryKey(record);
    }
}

