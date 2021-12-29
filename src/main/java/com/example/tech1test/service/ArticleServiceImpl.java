package com.example.tech1test.service;

import com.example.tech1test.dao.ArticleDAO;
import com.example.tech1test.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    @Transactional
    public List<Article> getAllArticle() {
        List<Article> articles = articleDAO.getAllArticle();
        return articles;
    }

    @Override
    @Transactional
    public void saveArticle(Article article) {
        articleDAO.saveArticle(article);
    }
}
