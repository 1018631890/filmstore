package com.example.SpringTset02.service;

import com.example.SpringTset02.bean.Ticket;
import com.example.SpringTset02.mapper.ticketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ticketService {

    @Autowired
    private ticketMapper ticketmapper;

    public Ticket[] getbyaccount(Integer id)
    {
        Ticket ticket[]=ticketmapper.GetByAccount(id);
        return ticket;
    }
}
