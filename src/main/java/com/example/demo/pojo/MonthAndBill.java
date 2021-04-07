package com.example.demo.pojo;

import lombok.Data;

@Data
public class MonthAndBill {
    private Integer month;
    private Integer bill;

    public MonthAndBill(Integer month, Integer bill){
        this.month = month;
        this.bill = bill;
    }
}
