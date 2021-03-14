package com.example.SpringTset02.bean;

public class Comment {
    private Integer account_id;
    private Integer film_id;
    private String comment;
    private Boolean like;
    private Double mark;
    private String title;
    private String account_name;
    private Double halfmark;
    private String time;

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public void setHalfmark(Double mark) {
        this.halfmark = mark/2;
    }

    public Double getMark() {
        return mark;
    }

    public Double getHalfmark() {
        return mark/2;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

}
