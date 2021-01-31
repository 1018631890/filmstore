package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Account;
import com.example.SpringTset02.mapper.accountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    accountMapper mapper;

    @GetMapping("/account/getbyname/")
    @CrossOrigin
    public Account GetaccountByName( String name)
    {
        return mapper.GetByName(name);
    }

    @GetMapping("/account/getbyid/{id}")
    public Account GetaccountById(@PathVariable("id") Integer id)
    {
        return mapper.GetById(id);
    }

    @GetMapping("/account/insert")
    public int Insertaccount(Account account)
    {
        if(mapper.Insert(account)>0)
        {
            return 1;
        }
        else {
            return -1;
        }
    }

    @GetMapping("/account/update")
    public Account Updateaccount(Account account)
    {
        if(mapper.Update(account)>0)
        {
            return mapper.GetById(account.getAccount_id());
        }else {
            return null;
        }
    }

    @GetMapping("/account/getall")
    public Account[] Getuserlist()
    {
        return mapper.GetAll();
    }

}
