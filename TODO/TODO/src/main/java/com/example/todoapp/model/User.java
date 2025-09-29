package com.example.todoapp.model;

public class User {

    // フィールド（メンバ変数）
    private int userID;
    private String name;
    private String email;

    // デフォルトコンストラクタ（必須：Springが内部で使います）
    public User() {
    }

    // コンストラクタ
    public User(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    // ゲッター
    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // セッター
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
