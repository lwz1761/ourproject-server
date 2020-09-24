package com.example.Service;

import com.example.dto.JsonResult;
import com.example.dto.userQueryDTO;
import com.example.entity.article;

public interface ArticleService {

    JsonResult getArticleByUser(userQueryDTO queryDTO);

    JsonResult getAllArticle(userQueryDTO userQueryDTO);

    JsonResult deleteArticle(String id);

    JsonResult findArticleById(String id);

    JsonResult updateArticleById(article article);
}
