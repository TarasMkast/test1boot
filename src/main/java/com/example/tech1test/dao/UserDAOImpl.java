package com.example.tech1test.dao;

import com.example.tech1test.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<User> getAllUser() {
        Session session = entityManager.unwrap(Session.class);
        return null;
    }

    @Override
    public void saveUser(User user) {

    }
}
