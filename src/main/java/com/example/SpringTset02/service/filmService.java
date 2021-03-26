package com.example.SpringTset02.service;

import com.example.SpringTset02.bean.Film;
import com.example.SpringTset02.mapper.filmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

@Service
public class filmService {

    @Autowired
    private filmMapper filmmapper;

//    @Cacheable(value = "film")
    public Film getbyname(String name)
    {
        Film film=filmmapper.GetByName(name);
        return film;
    }

    public Film[] getbywill(String will)
    {
        Film film[]=filmmapper.GetWill(will);
        return film;
    }

    public Film[] getall()
    {
        Film film[]=filmmapper.GetAll();
        return film;
    }

//    @Cacheable(value = "film",key = "#film.film_name")
    public Film insert(Film film)
    {
        filmmapper.Insert(film);
        Film film1=filmmapper.GetByName(film.getFilm_name());
        return film1;
    }

    public Film delete(Integer id)
    {
        Film film = filmmapper.GetById(id);
//        System.out.println(film.getFilm_pic());
        filmmapper.Delete(id);
        return film;
    }


    public Film[] update(Film film)
    {
        Film filmlist[] = new Film[2];
        filmlist[0] = filmmapper.GetById(film.getFilm_id());
        filmmapper.Update(film);
        filmlist[1] = filmmapper.GetById(film.getFilm_id());
        return filmlist;
    }

    @Cacheable(value = "film",key = "#s")
    public Film[] search(int will,String s)
    {
        Film film[];
        if(will == 2)
        {
            film = filmmapper.Search(s);
        }else {
            film = filmmapper.Searchbywill(will,s);
        }
        return film;
    }

}
