package com.example.demo.Pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Bill{
    private int id;
    private String name;
    private int bill;
    private String message;
    @JsonFormat(pattern="yyyy年MM月dd日 HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    public Bill(int id, String name, int bill, String message, Date time){
        this.id = id;
        this.name = name;
        this.bill = bill;
        this.message = message;
        this.time = time;
    }
}
