package com.proxidev.accountservice;

import com.proxidev.accountservice.entities.Account;
import com.proxidev.accountservice.enums.AccountType;
import com.proxidev.accountservice.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(AccountRepository accountRepository){
		return args -> {
            Account account1 = Account.builder()
				.id(UUID.randomUUID().toString())
				.balance(23344.00)
				.currency("XAF")
				.createdAt(LocalDateTime.now())
				.type(AccountType.CURRENT_ACCOUNT)
				.customerId(Long.valueOf(1))
				.build();
			Account account2 = Account.builder()
				.id(UUID.randomUUID().toString())
				.balance(63344.00)
				.currency("XAF")
				.createdAt(LocalDateTime.now())
				.type(AccountType.SAVING_ACCOUNT)
				.customerId(Long.valueOf(2))
				.build();
			
			accountRepository.saveAll(List.of(account1, account2)); 
		};
	}

}
