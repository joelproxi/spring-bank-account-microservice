package com.proxidev.accountservice.entities;

import com.proxidev.accountservice.enums.AccountType;
import com.proxidev.accountservice.models.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String currency;
    private Double balance;
    private LocalDateTime createdAt;
    @Enumerated(value = EnumType.STRING)
    private AccountType type;
    private Long customerId;
    @Transient
    private Customer customer;
    
}