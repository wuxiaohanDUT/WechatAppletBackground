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
    private Byte istop;
}
