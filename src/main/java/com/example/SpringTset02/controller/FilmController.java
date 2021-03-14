package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Film;
import com.example.SpringTset02.service.filmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private filmService filmservice;

    @GetMapping("/getbyname/")
    public Film GetfilmByName(String name)
    {
        Film film=filmservice.getbyname(name);
        return film;
    }

    @GetMapping("/getbywill/")
    public Film[] GetfilmByWill(String will)
    {
        return  filmservice.getbywill(will);
    }

    @GetMapping("/getall")
    public Film[] GetAllfilm()
    {
        return filmservice.getall();
    }

    @GetMapping("/insert")
    public boolean Insertfilm(Film film)
    {
        Film film1=filmservice.insert(film);
        if (film1.getFilm_id()!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/delete")
    public boolean Deletefilm(Integer id)
    {
        Film film=filmservice.delete(id);
        if(film==null)
            return true;
        else
            return false;
    }

    @GetMapping("/update")
    public boolean Updatefilm(Film film)
    {
        Film film1=filmservice.update(film);
        return true;
    }

    @GetMapping("/search")
    public Film[] Searchfilm(int will,String s)
    {
        Film film[]=filmservice.search(will,s);
        return film;
    }
}