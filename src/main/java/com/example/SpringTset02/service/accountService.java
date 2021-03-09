package com.example.SpringTset02.service;

import com.example.SpringTset02.bean.Account;
import com.example.SpringTset02.mapper.accountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountService {

    @Autowired
    private accountMapper accountmapper;

    public Account getbyname(String name)
    {
        Account account=accountmapper.GetByName(name);
        return account;
    }

    public Account getbyid(Integer id)
    {
        Account account=accountmapper.GetById(id);
        return account;
    }

    public Account insert(Account account)
    {
        accountmapper.Insert(account);
        Account account1=accountmapper.GetByName(account.getAccount_name());
        return account1;
    }

    public Account delete(Integer id)
    {
        accountmapper.DeleteById(id);
        Account account=accountmapper.GetById(id);
        return account;
    }

    public Account update(Account account)
    {
        accountmapper.Update(account);
        Account account1=accountmapper.GetByName(account.getAccount_name());
        return account1;
    }

    public Account[] getall()
    {
        Account account[]=accountmapper.GetAll();
        return account;
    }
}
