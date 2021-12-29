package com.example.tech1test.controller;

import com.example.tech1test.entity.User;
import com.example.tech1test.service.ArticleService;
import com.example.tech1test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class ControllerUser {

    @Autowired
    private UserService userService;

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        List<User> userList = userService.getAllUser();
        return userList;
    }

    @GetMapping("/age")
    public List<User> getUserAge() {

        return userService.getUserAge(userService.getAllUser());
    }

    @GetMapping("/color")
    public List<User> getUserColor() {

        return userService.getUserColor(articleService.getAllArticle());
    }

    @GetMapping("/article")
    public List<String> getUserArticle(){

        return userService.getUserArticle(userService.getAllUser());
    }

    @PostMapping()
    public User addUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

}
