package com.example.dao;

import com.example.entity.jurisdiction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface jurisdictionMapper {
    int deleteByPrimaryKey(String id);

    int insert(jurisdiction record);

    int insertSelective(jurisdiction record);

    jurisdiction selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(jurisdiction record);

    int updateByPrimaryKey(jurisdiction record);
}