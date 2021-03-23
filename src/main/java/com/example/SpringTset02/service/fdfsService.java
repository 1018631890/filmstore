package com.example.SpringTset02.service;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class fdfsService {

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

//    上传(返回路径）
    public String upload(InputStream inputStream,Integer filelength,String extname) throws FileNotFoundException{
        StorePath storePath = fastFileStorageClient.uploadFile(inputStream, filelength, extname, null);
        System.out.println(storePath.getFullPath());
        return storePath.getFullPath();
    }

//    删除
    public void delete(String path){
        fastFileStorageClient.deleteFile(path);
    }
}
