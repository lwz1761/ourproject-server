package com.example.ServiceImp;

import com.example.Service.ArticleService;
import com.example.dao.ArticlesMapper;
import com.example.dto.JsonResult;
import com.example.dto.PageResult;
import com.example.dto.articleDetailsDTO;
import com.example.dto.userQueryDTO;
import com.example.entity.article;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired(required = false)
    private ArticlesMapper articlesMapper;

    @Override
    public JsonResult getArticleByUser(userQueryDTO queryDTO) {

        //当前页
        if (queryDTO.getCurrentPage() <= 0){
            queryDTO.setCurrentPage(1);
        }
        //每页数量
        if (queryDTO.getPageSize() <= 0 ){
            queryDTO.setPageSize(5);
        }

        if (queryDTO.getUserName() == null){
            return new JsonResult(500,"查询我的文章失败:没有用户名");
        }
        PageHelper.startPage(queryDTO.getCurrentPage(),queryDTO.getPageSize());
        //根据用户名去查询
        PageResult pageResult = new PageResult();
        try {
            Page<article> myArticleList = articlesMapper.findByName(queryDTO.getUserName());
            pageResult.setTotal((int) myArticleList.getTotal());
            pageResult.setList(myArticleList.getResult());
            return new JsonResult(200,pageResult,"查询我的文章成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"查询我的文章失败");
        }
    }

    @Override
    public JsonResult getAllArticle(userQueryDTO userQueryDTO) {
        if (userQueryDTO.getCurrentPage() <= 0){
            userQueryDTO.setCurrentPage(1);
        }
        //每页数量
        if (userQueryDTO.getPageSize() <= 0 ){
            userQueryDTO.setPageSize(5);
        }

        PageHelper.startPage(userQueryDTO.getCurrentPage(),userQueryDTO.getPageSize());
        //根据用户名去查询
        PageResult pageResult = new PageResult();
        try {
            Page<article> articleList = articlesMapper.findAllArticle();
            pageResult.setTotal((int) articleList.getTotal());
            pageResult.setList(articleList.getResult());
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"查询所有文章失败");
        }
        return new JsonResult(200,pageResult,"查询所有文章成功");
    }

    @Override
    public JsonResult deleteArticle(String id) {
        try {
            articlesMapper.deleteArticle(id);
            return new JsonResult(200,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"删除失败");
        }
    }

    @Override
    public JsonResult findArticleById(String id) {
        try {
            article article = articlesMapper.findArticlxeById(id);
            return new JsonResult(200,article,"ID查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"ID查询失败");
        }
    }

    @Override
    public JsonResult updateArticleById(article article) {
        try {
            articlesMapper.updateArticleById(article);
            return new JsonResult(200,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(500,"修改失败");
        }
    }

    @Override
    public articleDetailsDTO getArticleDetailsByID(String articleID) {
        return articlesMapper.getArticleDetailsByID(articleID);
    }
}
