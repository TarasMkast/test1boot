package com.example.tech1test.service;

import com.example.tech1test.dao.UserDAO;
import com.example.tech1test.entity.Article;
import com.example.tech1test.entity.User;
import com.example.tech1test.enums.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUser() {
        List<User> users = userDAO.getAllUser();
        return users;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public List<User> getUserAge(List<User> users) {
        List<User> result = new ArrayList<>();
        ;
        for (User user : users) {
            if (user.getAge() > 18) {
                result.add(user);
            }
        }
        return result;
    }

    @Override
    @Transactional
    public List<User> getUserColor(List<Article> articles) {
        List<User> result = new ArrayList<>();
        ;
        for (Article article : articles) {
            if (article.getColor() == Color.BLACK) {
                result.add(article.getUser());
            }
        }
        return result;
    }

    @Override
    @Transactional
    public List<String> getUserArticle(List<User> users) {
        List<String> result = new ArrayList<>();
        for (User user : users) {
            if (user.getArticles().size() > 3) {
                result.add(user.getName());
            }
        }
        return result;
    }
}
