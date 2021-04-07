package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
public class Bill{
    private Integer id;
    private String name;
    private Integer bill;
    private String message;
    private Integer year;
    private Integer month;
    private Integer day;
    public Bill(Integer id, String name, Integer bill, String message, Integer year, Integer month, Integer day){
        this.id = id;
        this.name = name;
        this.bill = bill;
        this.message = message;
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
