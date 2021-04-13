package com.example.demo.controller;


import com.example.demo.dao.UserMemoMapper;
import com.example.demo.pojo.Memo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user2")
public class MemoController {

    @Resource
    private UserMemoMapper userMemoMapper;

    /**
     * 获取到所有的备忘录
     * @return
     */
    @GetMapping("getAllMemos")
    public List<Memo> getAllMemos(){
        System.out.println("getAllMemos");
        return userMemoMapper.getAllMemos();
    }

    /**
     * 添加一条备忘录
     * @param memo
     * @return
     */
    @PostMapping("addMemo")
    public String addMemo(@RequestBody Memo memo){
        if(userMemoMapper.insertMemo(memo) > 0){
            return "success";
        }
        return "failed";
    }

    /**
     * 更改一条备忘录
     * @param memo
     * @return
     */
    @PostMapping("updateMemo")
    public String updateMemo(@RequestBody Memo memo){
        System.out.println("updateMemo "+memo);
        if(userMemoMapper.updateMemo(memo) > 0){
            return "success";
        }
        return "failed";
    }

    /**
     * 删除一条备忘录
     * @param id
     * @return
     */
    @GetMapping("deleteMemo")
    public String deleteMemo(@RequestParam("id") Integer id){
        if(userMemoMapper.deleteMemo(id) > 0){
            return "success";
        }
        return "failed";
    }
}
