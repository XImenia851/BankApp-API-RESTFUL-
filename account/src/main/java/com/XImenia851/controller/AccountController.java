package com.XImenia851.controller;

import com.XImenia851.model.Account;
import com.XImenia851.model.Customer;
import com.XImenia851.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

@Autowired
    private AccountRepository accountRepository;

@PostMapping("/myAccount")
    public Account getAccountDetails(@RequestBody Customer customer) {

    Account account = accountRepository.findByCustomerId(customer.getCustomerId());
    if (account != null) {
        return account;
    }else {
        return null;
    }
    }
}
