package com.proxidev.accountservice.repositories;

import com.proxidev.accountservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
    
}