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

    public Ticket getticket(Integer account_id,Integer film_id)
    {
        Ticket ticket=ticketmapper.Getticket(account_id, film_id);
        return ticket;
    }

    public Ticket insert(Ticket ticket)
    {
        ticketmapper.Insert(ticket);
        Ticket ticket1=ticketmapper.Getticket(ticket.getAccount_id(),ticket.getFilm_id());
        return ticket1;
    }

    public Ticket delete(Integer account_id,Integer film_id)
    {
        ticketmapper.Delete(account_id, film_id);
        Ticket ticket=ticketmapper.Getticket(account_id, film_id);
        return ticket;
    }

    public Ticket update(Ticket ticket)
    {
        ticketmapper.Update(ticket);
        Ticket ticket1=ticketmapper.Getticket(ticket.getAccount_id(),ticket.getFilm_id());
        return ticket1;
    }

    public Ticket updatestate(Integer account_id,Integer film_id,String state)
    {
        Ticket ticket=ticketmapper.Getticket(account_id, film_id);
        ticket.setTicket_state(state);
        ticketmapper.Update(ticket);
        ticket=ticketmapper.Getticket(account_id, film_id);
        return ticket;
    }
}
