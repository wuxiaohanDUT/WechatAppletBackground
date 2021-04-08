package com.example.demo.controller;


import com.example.demo.pojo.Memo;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("user1")
public class MemoController {

    /**
     * 获取到所有的备忘录
     * @return
     */
    @GetMapping("getAllMemos")
    public List<Memo> getAllMemos(){
        return new LinkedList<>();
    }

    /**
     * 添加一条备忘录
     * @param memo
     * @return
     */
    @PostMapping("addMemo")
    public String addMemo(@RequestBody Memo memo){
        return "success";
    }

    /**
     * 更改一条备忘录
     * @param memo
     * @return
     */
    public String updateMemo(@RequestBody Memo memo){
        return "success";
    }
}
