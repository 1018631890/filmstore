package com.example.SpringTset02.service;

import com.example.SpringTset02.bean.Comment;
import com.example.SpringTset02.mapper.commentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class commentService {

    @Autowired
    private commentMapper commentmapper;

    public Comment[] getbyfilm(Integer film_id)
    {
        Comment comment[]=commentmapper.GetByFilm(film_id);
        return comment;
    }

    public Comment[] getbyaccount(Integer account_id)
    {
        Comment comment[]=commentmapper.GetByAccount(account_id);
        return comment;
    }

    public Comment getcomment(Integer film_id,Integer account_id)
    {
        Comment comment=commentmapper.GetComment(film_id,account_id);
        return comment;
    }

    public Comment insert(Comment comment)
    {
        commentmapper.Insert(comment);
        Comment comment1=commentmapper.GetComment(comment.getFilm_id(),comment.getAccount_id());
        return comment1;
    }

    public Comment update(Comment comment)
    {
        commentmapper.Update(comment);
        Comment comment1=commentmapper.GetComment(comment.getFilm_id(),comment.getAccount_id());
        return comment1;
    }

    public Comment delete(Comment comment)
    {
//        System.out.println(comment.getFilm_id()+","+comment.getAccount_id());
        commentmapper.Delete(comment);
        Comment comment1=commentmapper.GetComment(comment.getFilm_id(),comment.getAccount_id());
        return comment1;
    }
}
