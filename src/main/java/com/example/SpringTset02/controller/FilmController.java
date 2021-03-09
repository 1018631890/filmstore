package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Film;
import com.example.SpringTset02.service.filmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FilmController {

    @Autowired
    private filmService filmservice;

    @GetMapping("/film/getbyname/")
    public Film GetfilmByName(String name)
    {
        Film film=filmservice.getbyname(name);
        return film;
    }

    @GetMapping("/film/getbywill/")
    public Film[] GetfilmByWill(String will)
    {
        return  filmservice.getbywill(will);
    }

    @GetMapping("/film/getall")
    public Film[] GetAllfilm()
    {
        return filmservice.getall();
    }

    @GetMapping("/film/insert")
    public boolean Insertfilm(Film film)
    {
        Film film1=filmservice.insert(film);
        if (film1.getFilm_id()!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/film/delete")
    public boolean Deletefilm(Integer id)
    {
        Film film=filmservice.delete(id);
        if(film==null)
            return true;
        else
            return false;
    }

    @GetMapping("/film/update")
    public boolean Updatefilm(Film film)
    {
        Film film1=filmservice.update(film);
        return true;
    }

    @GetMapping("/film/search")
    public Film[] Searchfilm(int will,String s)
    {
        Film film[]=filmservice.search(will,s);
        return film;
    }
}