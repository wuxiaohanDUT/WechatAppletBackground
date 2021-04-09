package com.example.demo.controller;

import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Diary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("user3")
public class DiaryController {

    /**
     * 获取所有的日记
     * @return
     */
    @GetMapping("getAllDiary")
    public List<Diary> getAllDiary(){
        return new LinkedList<>();
    }
    /**
     * 添加一条日记
     * @param diary
     * @return
     */
    @PostMapping("addDiary")
    public String addDiary(@RequestBody Diary diary){
        return "success";
    }

    /**
     * 点赞一条日记
     * @param id
     * @return
     */
    @PostMapping("likeDiary")
    public String likeDiary(@RequestParam("id") Integer id){
        return "success";
    }

    /**
     * 评论一条日记
     * @param comment
     * @return
     */
    @PostMapping("commentDiary")
    public String commentDiary(@RequestBody Comment comment){
        return "success";
    }
}
