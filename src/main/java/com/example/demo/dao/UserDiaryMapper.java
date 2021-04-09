package com.example.demo.dao;

import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Diary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface UserDiaryMapper {
    List<Diary> getAllDiaries();
    Integer insertDiary(Diary diary);
    Integer insertComment(Comment comment);
    Integer updateDiary(Diary diary);
}
