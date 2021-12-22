package com.example.tech1test.dao;

import com.example.tech1test.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDAOImpl implements ArticleDAO{

    @Override
    public List<Article> getAllArticle() {
        return null;
    }

    @Override
    public void saveArticle(Article article) {

    }
}
