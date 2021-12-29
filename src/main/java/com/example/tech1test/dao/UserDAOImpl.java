package com.example.tech1test.dao;

import com.example.tech1test.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUser() {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUsers = query.getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.save(user);
    }
}
