package com.example.tech1test.dao;

import com.example.tech1test.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User>getAllUser();
    public void saveUser(User user);

}
