package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.News;
import com.example.SpringTset02.mapper.newsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private newsMapper newsmapper;

    @GetMapping("/news/getall")
    public News[] GetALLnews()
    {
        return newsmapper.GetAll();
    }

    @GetMapping("/news/insert")
    public int Insertnews(News news){
        if(newsmapper.Insert(news)>0)
        {
            return 1;
        }else {
            return -1;
        }
    }

    @GetMapping("/news/delete")
    public int Deletenews(Integer id){
        if(newsmapper.Delete(id)>0){
            return 1;
        }else {
            return -1;
        }
    }

    @GetMapping("/news/update")
    public int Updatenews(News news){
        if(newsmapper.Update(news)>0){
            return 1;
        }else {
            return -1;
        }
    }
}
