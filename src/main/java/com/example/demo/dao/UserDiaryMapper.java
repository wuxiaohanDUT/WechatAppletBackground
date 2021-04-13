package com.example.demo.dao;

import com.example.demo.pojo.Comment;
import com.example.demo.pojo.Diary;
import com.example.demo.pojo.Like;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDiaryMapper {
    List<Diary> getAllDiaries();
    List<Diary> getPesonalDiaries(String id);
    List<Comment> getCommentsByDiaryId(Integer id);
    List<Comment> getCommentsByUserId(String id);
    Integer insertDiary(Diary diary);
    Integer insertComment(Comment comment);
    Integer insertLike(Like like);
    Integer likeADiary(Integer id);
}
