package com.example.demo.Controller;


import com.example.demo.Pojo.Bill;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingDeque;

@RestController
@RequestMapping("user1")
public class TestController {

    private static List<Bill> list;
    private static int count;
    static {
        list = new LinkedList<>();
        Bill b1 = new Bill(1,"购物",100,"买菜花了1024", new Date());
        Bill b2 = new Bill(2,"购物",150,"买电脑花了2048", new Date());
        Bill b3 = new Bill(3,"购物",260,"买电脑花了2048", new Date());
        list.add(b1);
        list.add(b2);
        list.add(b3);
        count = 3;
    }
    @GetMapping("getBills")
    public List<Bill> getBills(String year, String month){
        System.out.println("getBills"+year+" "+month);
        return list;
    }
    @PostMapping("deleteBill")
    public String deleteBill(@RequestParam("toDeleteId") int toDeleteId){
        System.out.println("deleteBill"+toDeleteId);
        //System.out.println("delete "+list.get(id - 1));
        list.remove(toDeleteId - 1);
        return "success";
    }
    @PostMapping("addBill")
    public String addBill(@RequestParam("id") int id,
                          @RequestParam("bill") int bill,
                          @RequestParam("name") String name,
                          @RequestParam("message") String message,
                          @RequestParam("time") String time) throws ParseException {
        System.out.println(id);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = simpleDateFormat.parse(time);
        Bill newBill = new Bill(id,name,bill,message,date);
        System.out.println("addBill-"+newBill);
        if(newBill != null){
            list.add(newBill);
            return "success";
        }
        return "failed";
    }
}
