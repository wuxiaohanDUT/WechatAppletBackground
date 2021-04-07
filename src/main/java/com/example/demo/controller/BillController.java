package com.example.demo.controller;


import com.example.demo.dao.UserBillsMapper;
import com.example.demo.pojo.Bill;
import com.example.demo.pojo.MonthAndBill;
import javafx.util.Pair;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("user1")
public class BillController {

    @Resource
    private UserBillsMapper userBillsMapper;
    @GetMapping("getBills")
    public List<Bill> getBills(String year, String month) throws ParseException {
        System.out.print("method getBills  "+"params: "+year+" "+month);
        List<Bill> ans = userBillsMapper.getAllBillsByTime(Integer.valueOf(year),Integer.valueOf(month));
        System.out.println("  result: "+ans);
        return ans;
    }
    @PostMapping("deleteBill")
    public String deleteBill(@RequestParam("toDeleteId") int toDeleteId){
        System.out.print("deleteBill  "+toDeleteId);
        if(userBillsMapper.deleteBillById(toDeleteId) > 0){
            System.out.println(" success");
            return "success";
        }
        System.out.println(" failed");
        return "failed";
    }
    @PostMapping("addBill")
    public String addBill(@RequestBody Bill bill) {
        if(userBillsMapper.insertBill(bill) > 0){
            System.out.println("Insert Bill success "+bill);
            return "success";
        }
        System.out.println("Insert Bill failed "+bill);
        return "failed";
    }
    @GetMapping("getMonthSum")
    public List<MonthAndBill> getMonthSum(String year){
        System.out.println(year);
        if(year == null){
            System.out.println("param is null");
            return null;
        }
        int y = Integer.valueOf(year);
        List<MonthAndBill> list = new LinkedList<>();
        for(int i = 1; i <= 12; ++i){
            Integer sum = userBillsMapper.getMonthSum(y, i);
            if(sum != null){
                list.add(new MonthAndBill(i, sum));
            }
        }
        System.out.println("getMonthSum "+year+" "+list);
        return list;
    }
}
