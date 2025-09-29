package com.example.todoapp.dto;

import com.example.todoapp.model.User;
import com.example.todoapp.model.TaskStatus;
import java.time.LocalDate;

public class TaskRequest {
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;
    private User assignedTo;

    // ======= Getter =======

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    // ======= Setter =======

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }
}
