package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ticketMapper {

    @Select("select * from ticket where account_id=#{id}")
    public Ticket[] GetByAccount(Integer id);
}
