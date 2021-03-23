package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Comment;
import com.example.SpringTset02.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private commentService commentservice;

    @GetMapping("/getbyfilm")
    public Comment[] GetcommentByFilm(Integer film_id)
    {
        Comment comment[]=commentservice.getbyfilm(film_id);
        return comment;
    }

    @GetMapping("/getbyaccoount")
    public Comment[] GetcommentByAccount(Integer account_id)
    {
        Comment comment[]=commentservice.getbyaccount(account_id);
        return comment;
    }

    @GetMapping("/iscomment")
    public Boolean GetisComment(Integer film_id,Integer account_id)
    {
        Comment comment=commentservice.getcomment(film_id,account_id);
        if(comment!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/getcomment")
    public Comment GetComment(Integer film_id,Integer account_id)
    {
        Comment comment=commentservice.getcomment(film_id,account_id);
        return comment;
    }

    @GetMapping("/insert")
    public Boolean Insertcomment(Comment comment)
    {
        Comment comment1=commentservice.insert(comment);
        if (comment.getComment().equals(comment1.getComment()))
            return true;
        else
            return false;
    }

    @GetMapping("/delete")
    public Boolean Deletecomment(Comment comment)
    {
        Comment comment1=commentservice.delete(comment);
        if (comment1==null)
            return true;
        else
            return false;
    }
}
