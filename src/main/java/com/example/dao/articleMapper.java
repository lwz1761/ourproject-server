package com.example.dao;

import com.example.entity.article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface articleMapper {
    int deleteByPrimaryKey(String id);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKey(article record);
}