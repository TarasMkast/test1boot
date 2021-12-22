package com.example.tech1test.dao;

import com.example.tech1test.entity.Article;
import com.example.tech1test.entity.User;

import java.util.List;

public interface ArticleDAO {
    public List<Article> getAllArticle();
    public void saveArticle(Article article);

}
