package com.example.dao;


import com.example.dto.articleDetailsDTO;
import com.example.entity.article;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticlesMapper {

    Page<article> findByName(String userName);

    Page<article> findAllArticle();

    void deleteArticle(String id);

    article findArticlxeById(String id);

    void updateArticleById(article article);

    //    zhou-文章详情-得到文章信息
    articleDetailsDTO getArticleDetailsByID(String articleID);
}
