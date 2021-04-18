package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Ticket;
import com.example.SpringTset02.mapper.ticketMapper;
import com.example.SpringTset02.service.ticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private ticketService ticketservice;

    @GetMapping("/getbyaccount/")
    public Ticket[] GetticketByAccount(Integer id)
    {
        Ticket ticket[]=ticketservice.getbyaccount(id);
        return ticket;
    }

    @GetMapping("/insert")
    public boolean insertTicket(Ticket ticket)
    {
        Ticket ticket1=ticketservice.insert(ticket);
        if (ticket1.getTicket_num()!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/delete")
    public boolean deleteTicket(Integer account_id,Integer film_id)
    {
        Ticket ticket=ticketservice.delete(account_id, film_id);
        return true;
    }

    @GetMapping("/update")
    public boolean updateTicket(Ticket ticket)
    {
        Ticket ticket1=ticketservice.update(ticket);
        return true;
    }

    @GetMapping("/changestate")
    public boolean changeState(Integer account_id,Integer film_id,String state)
    {
        Ticket ticket=ticketservice.updatestate(account_id, film_id, state);
        return true;
    }
}
