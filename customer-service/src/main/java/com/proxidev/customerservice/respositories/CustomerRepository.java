package com.proxidev.customerservice.repositories;

import com.proxidev.customerservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}