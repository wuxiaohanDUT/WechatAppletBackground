package com.example.demo.pojo;

import lombok.Data;

@Data
public class Comment{
    private Integer id;
    private Integer likes;
    private Integer year;
    private Integer month;
    private Integer day;
    private String content;
    private String userId;
    private Integer diaryId;
    private String userName;

    public Comment(Integer id,Integer likes, Integer year, Integer month, Integer day, String content, String userId, Integer diaryId, String userName) {
        this.content = content;
        this.likes = likes;
        this.year = year;
        this.month = month;
        this.day = day;
        this.id = id;
        this.userId = userId;
        this.diaryId = diaryId;
        this.userName = userName;
    }
}
