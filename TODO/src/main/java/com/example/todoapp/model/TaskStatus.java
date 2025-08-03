package com.example.todoapp.model;

/**
 * タスクの状態を表す列挙型
 */
public enum TaskStatus {
    NOT_STARTED,   // 未着手
    IN_PROGRESS,   // 進行中
    COMPLETED,     // 完了
    ON_HOLD        // 保留中（必要に応じて追加）
}
