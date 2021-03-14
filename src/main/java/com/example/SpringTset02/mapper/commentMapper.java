package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.Comment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

@Mapper
public interface commentMapper {

    @Select("select * from comment join account on comment.account_id=account.account_id where film_id=#{film_id}")
    Comment[] GetByFilm(Integer film_id);

    @Select("select * from comment where account_id=#{account_id}")
    Comment[] GetByAccount(Integer account_id);

    @Select("select * from comment where film_id=#{film_id} and account_id=#{account_id}")
    Comment GetComment(Integer film_id,Integer account_id);

    @Insert("insert into comment(account_id,film_id,comment,mark,title,time) values(#{account_id},#{film_id},#{comment},#{mark},#{title},#{time})")
    int Insert(Comment comment);

    @Update("update comment set comment=#{comment},mark=#{mark},like=#{like},title=#{title},time=#{time} where film_id=#{film_id} and account_id=#{account_id}")
    int Update(Comment comment);

    @Delete("delete from comment where account_id=#{account_id},film_id=#{film_id}")
    int Delete(Comment comment);
}
