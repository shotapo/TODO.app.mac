package com.example.todoapp.dto;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String dueDate;
    private String status;
    
    // getter
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate; 
    }
    public String getStatus() {
        return status;
    }

    // setter
    public void setId( Long id) {
        this.id = id;
    }

    public void setTitle ( String title) {
        this.title = title;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void setDueDate (String dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    }


