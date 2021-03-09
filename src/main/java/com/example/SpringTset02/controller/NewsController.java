package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.News;
import com.example.SpringTset02.mapper.newsMapper;
import com.example.SpringTset02.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private newsService newsservice;

    @GetMapping("/news/getall")
    public News[] GetALLnews()
    {
        News news[]=newsservice.getall();
        return news;
    }

    @GetMapping("/news/insert")
    public boolean Insertnews(News news)
    {
        News news1=newsservice.insert(news);
        if (news1.getNews_id()!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/news/delete")
    public boolean Deletenews(Integer id)
    {
        boolean delete=newsservice.delete(id);
        return delete;
    }

    @GetMapping("/news/update")
    public boolean Updatenews(News news)
    {
        News news1=newsservice.update(news);
        return true;
    }
}
