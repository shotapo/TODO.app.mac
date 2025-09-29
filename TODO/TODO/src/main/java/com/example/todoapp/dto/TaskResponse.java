package com.example.todoapp.dto;

public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String duedate;
    private String status;
    
    // getter
    private Long getId() {
        return id;
    }

    private String getTitle() {
        return title;
    }

    private String getDescription() {
        return description;
    }

    private String getDuedate() {
        return duedate; 
    }
    private String getStatus() {
        return status;
    }

    // setter
    private void setId( Long id) {
        this.id = id;
    }

    private void setTitle ( String title) {
        this.title = title;
    }

    private void setDescription (String description) {
        this.description = description;
    }

    private void setDuedate (String duedate) {
        this.duedate = duedate;
    }

    private void setStatus (String status) {
        this.status = status;
    }

    }


