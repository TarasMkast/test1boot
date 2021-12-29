package com.example.tech1test.service;
import com.example.tech1test.entity.Article;
import com.example.tech1test.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    public List<User>getAllUser();
    public void saveUser(User user);
    public List<User> getUserAge(List<User> users);
    List<User> getUserColor(List<Article> articles);
    public List<String> getUserArticle(List<User> users);
}
