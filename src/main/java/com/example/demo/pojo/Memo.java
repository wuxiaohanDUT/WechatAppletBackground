package com.example.demo.pojo;


import lombok.Data;

@Data
public class Memo {
    private Integer id;
    private Integer year;
    private Integer month;
    private Integer day;
    private String title;
    private String content;
    private Boolean istop;

    public Memo(Integer id, Integer year, Integer month, Integer day, String title, String content, Boolean istop){
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.title = title;
        this.content = content;
        this.istop = istop;
    }
}
