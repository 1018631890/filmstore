package com.example.SpringTset02.controller;

import com.example.SpringTset02.service.fdfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@RestController
@ResponseBody
@RequestMapping("/fdfs")
public class FdfsController {

    @Autowired
    private fdfsService fdfsservice;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        String realFileName = file.getOriginalFilename();
        String extname = realFileName.substring(realFileName.lastIndexOf(".")+1);
        FileInputStream fileInputStream = (FileInputStream) file.getInputStream();
        String picpath = fdfsservice.upload(fileInputStream,file.getSize(),extname);
        return picpath;
    }

    @RequestMapping("/delete")
    public boolean delete(String path)
    {
        fdfsservice.delete(path);
        return true;
    }

}
