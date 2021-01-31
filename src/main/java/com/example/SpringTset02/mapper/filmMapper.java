package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.Film;
import org.apache.ibatis.annotations.*;

@Mapper
public interface filmMapper {

    @Select("select * from film where film_name=#{name}")
    Film GetByName(String name);

    @Select("select * from film where film_will=#{will}")
    Film[] GetWill(String will);

    @Select("select * from film")
    Film[] GetAll();

    @Insert("Insert into film(film_name,film_time,film_abstract,film_actors,film_evaluate,film_will,film_pic) values(#{film_name},#{film_time},#{film_abstract},#{film_actors},#{film_evaluate},#{film_will},#{film_pic})")
    int Insert(Film film);

    @Delete("delete from film where film_id=#{id}")
    int Delete(Integer id);

    @Update("update film set film_name=#{film_name},film_time=#{film_time},film_abstract=#{film_abstract},film_actors=#{film_actors},film_evaluate=#{film_evaluate},film_will=#{film_will},film_pic=#{film_pic} where film_id=#{film_id}")
    int Update(Film film);

    @Select("select * from film where film_will=#{will} and film_name like '%'#{s}'%' ")
    Film[] Searchbywill(int will,String s);

    @Select("select * from film where film_name like CONCAT('%',#{s},'%') ")
    Film[] Search(String s);

}
