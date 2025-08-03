package com.example.todoapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.todoapp.entity.Task;

/**
 * タスクの保存・読み込みを扱うクラス（仮実装）
 */
@Repository
public class TaskRepository {
    /**
     * タスク一覧を保存する（仮の処理）
     */
    public void saveTasks(List<Task> tasks) {
    
        System.out.println("タスクを保存しました（仮）");
    }

    /**
     * タスク一覧を読み込む（仮の処理）
     */
    public List<Task> loadTasks() {
        // 実際はファイルやDBから読み込む処理を書く
        System.out.println("タスクを読み込みました（仮）");
        return List.of();// 空のリストを返す
    }

    /* 
     * タスク一覧を表示する（仮の処理）
     */
    public void displayTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("タスクはありません（仮）");
        } else {
            System.out.println("タスク一覧");
        }
            for (Task task : tasks) {
                System.out.println(task);
            }
            System.out.println("タスクの表示が完了しました。（仮");     
    }

    // タスクをIDで検索する（仮の処理）
    public Task findTaskById(int id) {
        // 実際はリストからIDで検索する処理を書く
        System.out.println("タスクをIDで検索しました（仮）");
        return null; // 仮にnullを返す      
    }
}


