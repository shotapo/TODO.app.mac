package com.example.todoapp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.todoapp.entity.Task;

/**
 * タスクを管理するクラス
 * 業務ロジック（処理の流れを記載）
 */
@Service
public class TaskService {

    private List<Task> tasks;

    public TaskService() {
        tasks = new ArrayList<>();
    }

    // 内部ロジック用メソッド
    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public int getTaskCount() {
        return tasks.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskManager{\n");
        for (Task task : tasks) {
            sb.append(task.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    // TaskService.java
    public Task updateTask(int id, Task updatedTask) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.set(i, updatedTask);
                return updatedTask; // ← ここが変更ポイント
            }
        }
        return null;
    }



    public boolean markTaskAsCompleted(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            task.markComplete();  // TaskStatus を COMPLETED に変更
            return true;
        }
        return false;
    }

    public List<Task> getCompletedTasks() {
        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }

    public List<Task> getTasksSortedByDeadline() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
    }

    // ✅ TaskController から呼ばれる公開用エイリアスメソッド

    public List<Task> getAllTasks() {
        return getTasks();
    }

    public Task createTask(Task task) {
        addTask(task);
        return task;
    }

    public Task getTaskById(int id) {
        return findTaskById(id);
    }

    public void deleteTask(int id) {
        removeTask(id);
    }
}
