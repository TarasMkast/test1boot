package com.example.tech1test.controller;

import com.example.tech1test.entity.User;
import com.example.tech1test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class ControllerUser {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        List<User> userList = userService.getAllUser();
        return userList;
    }

    @GetMapping("/age")
    public List<User> getUserAge() {
        List<User> users = userService.getUserAge();
        return users;
    }

    @GetMapping("/color")
    public List<User> getUserColor() {
        List<User> users = userService.getUserColor();
        return users;
    }

    @GetMapping("/article")
    public List<String> getUserArticle() {
        List<String> users = userService.getUserArticle();
        return users;
    }

    @PostMapping()
    public User addUser(@RequestBody User user) {

        userService.saveUser(user);
        return user;
    }

}
