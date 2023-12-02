package com.proxidev.customerservice.controllers;

import com.proxidev.customerservice.models.Customer;
import com.proxidev.customerservice.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    @GetMapping("")
    public List<Customer> customerList(){
        return  customerRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Customer customerDetail(@PathVariable Long id){
        return customerRepository.findById(Long.valueOf(id)).get();
    }
}