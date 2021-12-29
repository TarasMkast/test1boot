package com.example.tech1test.service;

import com.example.tech1test.entity.Article;
import com.example.tech1test.entity.User;

import java.util.List;

public interface ArticleService {
    public List<Article> getAllArticle();
    public void saveArticle(Article article);
}
