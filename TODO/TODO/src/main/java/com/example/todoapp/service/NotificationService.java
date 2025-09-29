package com.example.todoapp.service;

import com.example.todoapp.entity.Task;
import com.example.todoapp.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * タスクの通知を行うサービスクラス
 */
public class NotificationService {
    /**
    * タスクの締め切りが近いことを標準出力に通知する（仮の実装）
    */ 
    public void sendReminder(Task task) {
        System.out.println("通知: タスク '" + task.getTitle() + "' の締切が近づいています！"); }

        @Override
        public String toString() {
            return "NotificationService []";
        }

    /**
     * 複数タスクに対して、期限が1日前のものを通知し、ユーザーのメールアドレスに送信する
     * @param tasks 通知対象のタスク一覧
     * @param user 通知先のユーザー
     * @return 通知メッセージ一覧（画面表示やログに使える）
     */
    public List<String> beforeOneDayReminder(List<Task> tasks, User user) {
        List<String> messages = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (Task task : tasks) {
            LocalDate deadline = task.getDeadline();
            if (deadline.minusDays(1).equals(today)) {
                String message = "🔔 タスク「" + task.getTitle() + "」の期限は明日です！";
                messages.add(message);

                // 仮のメール送信処理（実際はメールAPIなどを使う）
                System.out.println("📧 " + user.getEmail() + " に通知を送信: " + message);
            }
        }

        return messages;
    }
}

