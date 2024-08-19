# Spring Boot JPA 블로그 프로젝트

## 1. 의존성
- devtools
- Spring Web
- mustache
- lombok
- JPA
- H2
- MySQL

## 2. 모델링
```SQL
User
id
username
password
createdAt

Post
id
title
content
userId
createdAt
``