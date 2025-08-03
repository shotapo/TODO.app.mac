package com.example.todoapp.entity;

import java.time.LocalDate;
import com.example.todoapp.model.TaskStatus;
import com.example.todoapp.model.User;

public class Task {

    private long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;
    private User assignedTo;

    public Task() {
    }

    public Task(int id, String title, String description, LocalDate dueDate, TaskStatus status, User assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.assignedTo = assignedTo;
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    public void markComplete() {
        this.status = TaskStatus.COMPLETED;
    }

    // ✅ 追加：完了状態かどうかを返す
    public boolean isCompleted() {
        return this.status == TaskStatus.COMPLETED;
    }

    // ✅ 追加：締切日を取得（TaskServiceで使用）
    public LocalDate getDeadline() {
        return this.dueDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }
}
