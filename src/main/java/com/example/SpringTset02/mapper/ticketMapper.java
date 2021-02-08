package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ticketMapper {

    @Select("select * from ticket join film on ticket.film_id=film.film_id where account_id=#{id}")
    public Ticket[] GetByAccount(Integer id);
}
