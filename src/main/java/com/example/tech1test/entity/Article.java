package com.example.tech1test.entity;

import com.example.tech1test.enums.Color;

import javax.persistence.*;

@Entity
@Table(name = "Article")
public class Article {

@Id
@GeneratedValue
@Column(name = "Id", nullable = false)
private int id;

@Column(name = "text")
private String text;

@Column(name = "color")
@Enumerated(EnumType.STRING)
private Color color;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "user_id")
private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article(){}

    public Article(String text, Color color) {
        this.text = text;
        this.color = color;
    }
}
