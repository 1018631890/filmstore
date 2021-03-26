package com.example.SpringTset02.service;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Service
public class fdfsService {

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

//    上传(返回路径）
    public String upload(InputStream inputStream,Long filelength,String extname) throws FileNotFoundException{
        StorePath storePath = fastFileStorageClient.uploadFile(inputStream, filelength, extname, null);
        System.out.println(storePath.getFullPath());
        return storePath.getFullPath();
    }

//    删除
    public boolean delete(String path){
        fastFileStorageClient.deleteFile(path);
        return true;
    }

//    转存
    public String save(MultipartFile file) throws IOException {
        if(file !=null)
        {
            String path = System.getProperty("user.dir")+"\\src\\main\\resources\\static\\filmimage\\";
            String filename = file.getOriginalFilename();
            File file1 = new File(path+filename);
            file.transferTo(file1);
            return path+filename;
        }else {
            return "error";
        }
    }
}
