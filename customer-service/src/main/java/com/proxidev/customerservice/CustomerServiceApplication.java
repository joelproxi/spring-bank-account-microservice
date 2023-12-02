package com.proxidev.customerservice;

import com.proxidev.customerservice.models.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proxidev.customerservice.repositories.CustomerRepository;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
            customerRepository.save(
					Customer.builder()
				.firstName("Joel")
				.lastName("Edm")
				.email("jo@g.com")
				.build());
			customerRepository.save(
					Customer.builder()
				.firstName("Mou")
				.lastName("Edm")
				.email("jo@g.com")
				.build());
		};
	}

}
