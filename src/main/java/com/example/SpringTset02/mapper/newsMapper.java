package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.News;
import org.apache.ibatis.annotations.*;

@Mapper
public interface newsMapper {

    @Select("select * from news")
    public News[] GetAll();

    @Select("select * from news where news_title=#{title}")
    public News GetbyTitle(String title);

    @Insert("insert into news(news_type,news_title,news_time,news_text,summary) values(#{news_type},#{news_title},#{news_time},#{news_text},#{summary})")
    public int Insert(News news);

    @Delete("delete from news where news_id=#{id}")
    public int Delete(Integer id);

    @Update("update news set news_type=#{news_type},news_title=#{news_title},news_time=#{news_time},news_text=#{news_text},summary=#{summary} where news_id=#{news_id}")
    public int Update(News news);
}
