package com.example.SpringTset02.service;

import com.example.SpringTset02.bean.News;
import com.example.SpringTset02.mapper.newsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class newsService {

    @Autowired
    private newsMapper newsmapper;

    public News[] getall()
    {
        News news[]=newsmapper.GetAll();
        return news;
    }

    public News insert(News news)
    {
        newsmapper.Insert(news);
        News news1=newsmapper.GetbyTitle(news.getNews_title());
        return news1;
    }

    public News update(News news)
    {
        newsmapper.Update(news);
        News news1=newsmapper.GetbyTitle(news.getNews_title());
        return news1;
    }

    public boolean delete(Integer id)
    {
        newsmapper.Delete(id);
        return true;
    }

}
