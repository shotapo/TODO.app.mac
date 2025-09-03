package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/taskpage")
    public String showTaskpage() {
        return "task"; // resources/templates/tasks.htmlを返す
        }   
}
