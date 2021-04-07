package com.example.demo.dao;

import com.example.demo.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserBillsMapper {

    List<Bill> getAllBillsByTime(@Param("year") Integer year, @Param("month") Integer month);

    int deleteBillById(Integer id);

    int insertBill(Bill bill);

    Integer getMonthSum(@Param("year") Integer year, @Param("month") Integer month);
}
