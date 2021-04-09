package com.example.demo.dao;

import com.example.demo.pojo.Memo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMemoMapper {
    Integer insertMemo(Memo memo);
    Integer updateMemo(Memo memo);
    List<Memo> getAllMemos();
}
