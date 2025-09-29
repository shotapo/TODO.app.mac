package com.example.todoapp.controller;

import com.example.todoapp.entity.Task;
import com.example.todoapp.service.TaskService;
import com.example.todoapp.dto.TaskRequest;
import java.util.List;
import org.springframework.web.bind.annotation.*;  // 必須アノテーションのインポート

@RestController
@RequestMapping("/tasks")
// /tasksにアクセスした際にこのコントローラーが呼ばれるよ
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * タスクの一覧を取得する
     * @return タスクのリスト
     * ユーザーが送るリクエスト（タスクの作成、取得、更新、削除など）を受け取り、service層にゆだねる
     */

    // タスク一覧を取得する
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    //　新しいタスクを取得するAPI 
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // 新しいタスクを登録する
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id) {
        return taskService.getTaskById(id);
    }

    // タスクを更新する
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    // タスクを削除する
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
    }

    // DTO（TaskRequest)からタスクを作成する
    @PostMapping("/request")
    public Task createTaskFromRequest(@RequestBody TaskRequest taskRequest) {
        Task task = new Task();
        task.setTitle(taskRequest.getTitle());
        task.setDescription(taskRequest.getDescription());
        task.setDueDate(taskRequest.getDueDate());
        task.setStatus(taskRequest.getStatus());
        task.setAssignedTo(taskRequest.getAssignedTo());

        return taskService.createTask(task);
    }
}



