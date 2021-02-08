package com.example.SpringTset02.bean;

public class Ticket {
    private Integer account_id;
    private Integer film_id;
    private String ticket_starttime;
    private String ticket_endtime;
    private String ticket_state;
    private String film_name;

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
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

    public String getTicket_starttime() {
        return ticket_starttime;
    }

    public void setTicket_starttime(String ticket_starttime) {
        this.ticket_starttime = ticket_starttime;
    }

    public String getTicket_endtime() {
        return ticket_endtime;
    }

    public void setTicket_endtime(String ticket_endtime) {
        this.ticket_endtime = ticket_endtime;
    }

    public String getTicket_state() {
        return ticket_state;
    }

    public void setTicket_state(String ticket_state) {
        this.ticket_state = ticket_state;
    }
}
