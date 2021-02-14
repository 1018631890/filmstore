package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Film;
import com.example.SpringTset02.mapper.filmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FilmController {

    @Autowired
    private filmMapper filmmapper;

    @GetMapping("/film/getbyname/")
    @Cacheable(value = "film")
    public Film GetfilmByName(String name)
    {
        return filmmapper.GetByName(name);
    }

    @GetMapping("/film/getbywill/")
    public Film[] GetfilmByWill(String will)
    {
        return  filmmapper.GetWill(will);
    }

    @GetMapping("/film/getall")
    @Cacheable(value = "allfilm")
    public Film[] GetAllfilm()
    {
        return filmmapper.GetAll();
    }

    @GetMapping("/film/insert")
    public int Insertfilm(Film film)
    {
        if(filmmapper.Insert(film)>0)
        {
            return 1;
        }else {
            return -1;
        }
    }

    @GetMapping("/film/delete")
    public int Deletefilm(Integer id)
    {
        if(filmmapper.Delete(id)>0)
        {
            return 1;
        }else {
            return -1;
        }
    }

    @GetMapping("/film/update")
    public int Updatefilm(Film film)
    {
        if(filmmapper.Update(film)>0)
        {
            return 1;
        }else {
            return -1;
        }
    }

    @GetMapping("/film/search")
    public Film[] Searchfilm(int will,String s)
    {
        if(will == 2)
        {
            return filmmapper.Search(s);
        }else {
            return filmmapper.Searchbywill(will,s);
        }
    }
}