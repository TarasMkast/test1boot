package com.example.tech1test.init;


import com.example.tech1test.entity.Article;
import com.example.tech1test.entity.User;
import com.example.tech1test.enums.Color;
import com.example.tech1test.service.ArticleService;
import com.example.tech1test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class DataInit implements ApplicationRunner {

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articleService;

    Random random = new Random();

    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<String> nameUser = new ArrayList<>();
        List<User> userList = new ArrayList<>();

        {
            nameUser.add("Ivan");
            nameUser.add("Taras");
            nameUser.add("Vika");
            nameUser.add("Misha");
            nameUser.add("Petro");
            nameUser.add("Ira");
            nameUser.add("Igor");
        }

        for (int i = 1; i <= 5; i++) {
            String randomName = nameUser.get(random.nextInt(nameUser.size()));
            User user = new User(randomName, random.nextInt(31));

            userService.saveUser(user);
            userList.add(user);
        }

        List<String> articleList = new ArrayList<>();
        {
            articleList.add("Водій");
            articleList.add("Лікар");
            articleList.add("Вчитель");
            articleList.add("Програміст");
            articleList.add("Космонавт");
            articleList.add("Політик");
            articleList.add("Археолог");
            articleList.add("Письменнк");
        }

        int k;
        for (int i = 1; i <= 8; i++) {
            String randomTextArticle = articleList.get(random.nextInt(articleList.size()));
            Article article = new Article(randomTextArticle, Color.randomColor());
            k = random.nextInt(5);
            for (int j = 1; j <= k; j++){
                Collections.shuffle(userList);
                User randomUser = userList.get(random.nextInt(userList.size()));
                article.setUser(randomUser);
            }
            articleService.saveArticle(article);
        }
        System.out.println("Інформацію додано!");
    }
}