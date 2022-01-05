# Spring Boot 

This is a sample Java 11 / Maven / Spring Boot (version 2.6.1) / Hibernate / JUnit application 

## How to Run 

* Clone this repository 
 git clone https://github.com/TarasMkast/test1boot.git

* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run ``mvn clean package```
* Once successfully built, you can run the service:

```
        mvn spring-boot:run 
```

## About the service

The service is just a simple User and Article review REST service. It uses an in-memory database (H2) to store the data.

Here are endpoints you can call:

#GET

```
http://www.localhost:8080/api/users/all

http://www.localhost:8080/api/articles/all

http://www.localhost:8080/api/users/age

http://www.localhost:8080/api/users/color

http://www.localhost:8080/api/users/article

```

#POST

```
http://www.localhost:8080/api/users/

http://www.localhost:8080/api/articles/

```



# Questions and Comments: tarasmotalo@gmail.com
