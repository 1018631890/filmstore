package com.example.SpringTset02.mapper;

import com.example.SpringTset02.bean.Account;
import org.apache.ibatis.annotations.*;

@Mapper
public interface accountMapper {

    @Select("select * from account where account_id=#{id}")
    Account GetById(Integer id);

    @Select("select * from account where account_name=#{name}")
    Account GetByName(String name);


    @Select("select account_id,account_name,type from account")
    Account[] GetAll();

    @Delete("delete from account where account_id=#{id}")
    int DeleteById(Integer id);

    @Insert("insert into account(account_name,account_password,type,email) values(#{account_name},#{account_password},#{type},#{email})")
    int Insert(Account account);

    @Update("update account set account_password=#{account_password},account_name=#{account_name},email=#{email} where account_id=#{account_id}")
    int Update(Account account);

}
