package com.naver.user.domain.dto;

public class User {
    private String id;
    private String pw;

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }


}