package com.example.demo.pojo;

import lombok.Data;

@Data
public class Diary {
    private Integer id;
    private String content;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer likes;
    private String userId;
    private String address;
    private Integer comments;
    private String userName;
    private Boolean isPrivate;

    public Diary(Integer id, String content, Integer year, Integer month, Integer day, Integer likes, String userId, String address, Integer comments, String userName, Boolean isPrivate) {
        this.id = id;
        this.content = content;
        this.year = year;
        this.month = month;
        this.day = day;
        this.likes = likes;
        this.userId = userId;
        this.address = address;
        this.comments = comments;
        this.userName = userName;
        this.isPrivate = isPrivate;
    }
}
