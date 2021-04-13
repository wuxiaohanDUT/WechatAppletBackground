package com.example.demo.pojo;


import lombok.Data;

@Data
public class Like {
    private String userId;
    private String userName;
    private Integer diaryId;
    private Integer year;
    private Integer month;
    private Integer day;

    public Like(String userId, String userName, Integer diaryId, Integer year, Integer month, Integer day) {
        this.userId = userId;
        this.userName = userName;
        this.diaryId = diaryId;
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
