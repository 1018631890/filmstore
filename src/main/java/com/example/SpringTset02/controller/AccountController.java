package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Account;
import com.example.SpringTset02.mapper.accountMapper;
import com.example.SpringTset02.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    accountService accountservice;

    @GetMapping("/account/getbyname/")
    public Account GetaccountByName( String name)
    {
        Account account=accountservice.getbyname(name);
        return account;
    }

    @GetMapping("/account/getbyid/{id}")
    public Account GetaccountById(@PathVariable("id") Integer id)
    {
        Account account=accountservice.getbyid(id);
        return account;
    }

    @GetMapping("/account/insert")
    public boolean Insertaccount(Account account)
    {
        Account account1=accountservice.insert(account);
        if (account1.getAccount_id()!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/account/update")
    public boolean Updateaccount(Account account)
    {
        Account account1=accountservice.update(account);
        return true;
    }

    @GetMapping("/account/getall")
    public Account[] Getuserlist()
    {
        Account account[]=accountservice.getall();
        return account;
    }

}
