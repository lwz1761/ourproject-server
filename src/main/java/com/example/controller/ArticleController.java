package com.example.controller;
import com.example.Service.ArticleService;
import com.example.dto.JsonResult;
import com.example.dto.userQueryDTO;
import com.example.entity.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@CrossOrigin
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 我的文章
     * @param userQueryDTO
     * @return JsonResult
     */
    @PostMapping("/getArticleByUser")
    @CrossOrigin
    public JsonResult getArticleByUser(@RequestBody userQueryDTO userQueryDTO){
        return articleService.getArticleByUser(userQueryDTO);
    }

    /**
     * 所有文章
     * @param userQueryDTO
     * @return
     */
    @PostMapping("/getAllArticle")
    @CrossOrigin
    public JsonResult getAllArticle(@RequestBody userQueryDTO userQueryDTO){
        return articleService.getAllArticle(userQueryDTO);
    }

    @PostMapping("/deleteArticle")
    @CrossOrigin
    public JsonResult deleteArticle(@RequestBody Map map){
        return articleService.deleteArticle((String) map.get("id"));
    }

    @PostMapping("/findArticleById")
    @CrossOrigin
    public JsonResult findArticleById(@RequestBody Map map){
        return articleService.findArticleById((String) map.get("id"));
    }

    @PostMapping("/updateArticleById")
    @CrossOrigin
    public JsonResult updateArticleById(@RequestBody article article){
        return articleService.updateArticleById(article);
    }
}
