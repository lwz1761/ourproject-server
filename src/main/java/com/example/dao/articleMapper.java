package com.example.dao;

import com.example.entity.article;

public interface articleMapper {
    int deleteByPrimaryKey(String articleid);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(String articleid);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKeyWithBLOBs(article record);

    int updateByPrimaryKey(article record);
}