package com.example.demo;

import com.example.demo.dao.UserBillsMapper;
import com.example.demo.dao.UserMemoMapper;
import com.example.demo.pojo.Bill;
import com.example.demo.pojo.Memo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan(basePackages={"com.example.demo.dao"})
class WxtestApplicationTests {

    @Resource
    private UserBillsMapper userBillsMapper;

    @Resource
    private UserMemoMapper userMemoMapper;
    @Test
    void contextLoads() {
        Date now = new Date();
        //List<Bill> bills = userBillsMapper.getAllBillsByTime(now);
        //System.out.println(bills);
    }

    @Test
    void test1(){
        userBillsMapper.deleteBillById(6);
    }

    @Test
    void test2(){
        //Bill bill = new Bill(0,"test",100,"test",new java.sql.Date(new Date().getTime()));
        //userBillsMapper.insertBill(bill);
    }

    @Test
    void test3() throws ParseException {
        Date date = new Date(2021,5,15);
        System.out.println(date);
        //System.out.println(userBillsMapper.getAllBillsByTime(date));
    }

    @Test
    void test4(){
        //int n = userBillsMapper.getMonthSum(2021,4);
        for(int i = 1; i <= 12; ++i){
            Integer n = userBillsMapper.getMonthSum(2021,i);
            if(n != null){
                System.out.println(n);
            }
        }
    }

    @Test
    void test5(){
        Memo memo = new Memo(0,2021, 4, 8, "title", "content", true);
        userMemoMapper.insertMemo(memo);
    }
    @Test
    void test6(){
        System.out.println(userMemoMapper.getAllMemos());
    }
}
