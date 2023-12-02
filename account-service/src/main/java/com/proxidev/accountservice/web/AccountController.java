package com.proxidev.accountservice.web;

import com.proxidev.accountservice.entities.Account;
import com.proxidev.accountservice.repositories.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/accounts")
public class AccountController {
    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    @GetMapping
    public List<Account> getAccountList(){
        return accountRepository.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public Account getAccountDetail(@PathVariable String id){
        return accountRepository.findById(id).get();
    }
}