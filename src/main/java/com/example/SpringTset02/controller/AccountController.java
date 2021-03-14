package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Account;
import com.example.SpringTset02.mapper.accountMapper;
import com.example.SpringTset02.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    accountService accountservice;

    @GetMapping("/getbyname/")
    public Account GetaccountByName( String name)
    {
        Account account=accountservice.getbyname(name);
        return account;
    }

    @GetMapping("/getbyid/{id}")
    public Account GetaccountById(@PathVariable("id") Integer id)
    {
        Account account=accountservice.getbyid(id);
        return account;
    }

    @GetMapping("/insert")
    public boolean Insertaccount(Account account)
    {
        Account account1=accountservice.insert(account);
        if (account1.getAccount_id()!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/update")
    public boolean Updateaccount(Account account)
    {
        Account account1=accountservice.update(account);
        return true;
    }

    @GetMapping("/getall")
    public Account[] Getuserlist()
    {
        Account account[]=accountservice.getall();
        return account;
    }

}
