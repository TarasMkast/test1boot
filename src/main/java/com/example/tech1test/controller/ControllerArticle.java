package com.example.tech1test.controller;

import com.example.tech1test.entity.Article;
import com.example.tech1test.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ControllerArticle {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")
    public List<Article> getAllArticles(){
        List<Article> articleList = articleService.getAllArticle();
        return articleList;
    }

    @PostMapping()
    public Article addArticle(@RequestBody Article article){
        articleService.saveArticle(article);
        return article;
    }
}
