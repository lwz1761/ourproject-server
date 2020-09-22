package com.example.ServiceImp;

import com.example.Service.userService;
import com.example.dao.userMapper;
import com.example.dto.JsonResult;
import com.example.dto.PageResult;
import com.example.dto.currentPage;
import com.example.dto.userQueryDTO;
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
    public int deleteByPrimaryKey(String[] ids) {
        return userMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public PageResult<user> getUserList(userQueryDTO record) {
        //  判断参数是否有误
        if(record.getCurrentPage() <= 0){
            record.setCurrentPage(1);  //设置默认当前页
        }
        if(record.getPageSize() <= 0) {
            record.setPageSize(5); // 默认每页5条
        }

        PageHelper.startPage(record.getCurrentPage(),record.getPageSize());
        List<user> userList = userMapper.getUserList(record);

        PageInfo<user> pageInfo = new PageInfo<>(userList);
        PageResult<user> result = new PageResult<user>();
        result.setTotal((int)pageInfo.getTotal());
        result.setList(userList);

        return result;
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

