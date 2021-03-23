package com.example.SpringTset02;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;

@MapperScan
@SpringBootApplication
@EnableCaching
@Import(FdfsClientConfig.class)
public class SpringApplication03 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication03.class, args);
    }

}
