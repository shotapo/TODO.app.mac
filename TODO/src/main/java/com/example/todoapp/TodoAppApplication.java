package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Spring Boot アプリの起動ポイント
public class TodoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppApplication.class, args);
    }
}

