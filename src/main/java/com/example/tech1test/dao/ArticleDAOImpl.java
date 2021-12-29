package com.example.tech1test.dao;

import com.example.tech1test.entity.Article;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ArticleDAOImpl implements ArticleDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Article> getAllArticle() {

        return entityManager.createQuery("from Article", Article.class).getResultList();
    }

    @Override
    public void saveArticle(Article article) {

        Session session = entityManager.unwrap(Session.class);
        session.save(article);
    }
}
