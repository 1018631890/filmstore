package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Ticket;
import com.example.SpringTset02.mapper.ticketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private ticketMapper ticketmapper;

    @GetMapping("/ticket/getbyaccount/")
    public Ticket[] GetticketByAccount(Integer id){
        return ticketmapper.GetByAccount(id);
    }
}
