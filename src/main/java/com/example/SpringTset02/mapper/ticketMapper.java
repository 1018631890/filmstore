package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.Ticket;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ticketMapper {

    @Select("select * from ticket join film on ticket.film_id=film.film_id where account_id=#{id}")
    public Ticket[] GetByAccount(Integer id);

    @Select("select * from ticket where account_id=#{account_id} and film_id=#{film_id}")
    public Ticket Getticket(Integer account_id,Integer film_id);

    @Insert("insert into ticket(account_id,film_id,ticket_starttime,ticket_endtime,ticket_state,ticket_num) values(#{account_id},#{film_id},#{ticket_starttime},#{ticket_endtime},'未使用',#{ticket_num})")
    public int Insert(Ticket ticket);

    @Delete("delete from ticket where account_id=#{account_id},film_id=#{film_id}")
    public int Delete(Integer account_id,Integer film_id);

    @Update("update ticket set ticket_starttime=#{ticket_starttime},ticket_endtime=#{ticket_endtime},ticket_state=#{ticket_state},ticket_num=#{ticket_num} where account_id=#{account_id} and film_id=#{film_id}")
    public int Update(Ticket ticket);
}
