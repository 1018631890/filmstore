package com.example.SpringTset02;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class SpringApplication03Tests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    @Test
    public void test(){
        stringRedisTemplate.opsForValue().append("msg","hello");
    }

    @Test
    public void contextLoads() throws FileNotFoundException {
//        File file = new File("E://Idea//menu//SpringTest03//src//main//resources//static//image//blackfilm.png");
//        String extName=file.getName().substring(file.getName().lastIndexOf(".")+1);
//        System.out.println(extName);
//        FileInputStream inputStream = new FileInputStream(file);
//        上传（文件流，文件长度，后缀，null）
//        StorePath storePath = fastFileStorageClient.uploadFile(inputStream, file.length(), extName, null);
//        System.out.println(storePath.getFullPath());
//        删除（路径）
        fastFileStorageClient.deleteFile("group1/M00/00/00/rBUAEGBat0qAT711AABwUI0XOqs117.png");
//        System.out.println(storePath.getFullPath());


    }

}
