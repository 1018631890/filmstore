package com.example.SpringTset02.controller;

import com.example.SpringTset02.bean.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private ArrayList<Account> arrayList =new ArrayList<>();

    @GetMapping("/addlist")
    public String addlist(Integer accountid)
    {
        Account account =new Account();
        account.setAccount_id(accountid);
        arrayList.add(account);
        return "已添加到队列";
    }

    @GetMapping("/dellist")
    public String dellist(Integer accountid)
    {
        for (int i=0;i<arrayList.size();i++)
        {
            Account account=arrayList.get(i);
            if(account.getAccount_id()==accountid)
                arrayList.remove(account);
        }
        return "已从队列中删除";
    }

    @GetMapping("/get")
    public Boolean getsituation(Integer accountid)
    {
        Boolean flag = true;
        for (int i=0;i<arrayList.size();i++)
        {
            Account account=arrayList.get(i);
            if(account.getAccount_id()==accountid)
                flag = false;
        }
        return flag;
    }
}
