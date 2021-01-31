package com.example.SpringTset02;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class SpringApplication03 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication03.class, args);
    }

}
