package com.example.tech1test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @OneToMany(fetch = FetchType.LAZY,
                mappedBy = "user")
    private List<Article>articles;

    public User(){}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setArticles(Article article) {
        if (articles == null){
            articles = new ArrayList<Article>();
        }
        articles.add(article);
        article.setUser(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

