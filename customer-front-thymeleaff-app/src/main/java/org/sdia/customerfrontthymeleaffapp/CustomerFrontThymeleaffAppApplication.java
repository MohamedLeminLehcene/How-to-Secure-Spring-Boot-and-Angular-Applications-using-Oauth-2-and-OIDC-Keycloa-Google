package org.sdia.customerfrontthymeleaffapp;

import org.sdia.customerfrontthymeleaffapp.entites.Customer;
import org.sdia.customerfrontthymeleaffapp.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleaffAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleaffAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){

        return  args -> {

            customerRepository.save(Customer.builder().name("Bate").email("bate@gmail.com").build());
            customerRepository.save(Customer.builder().name("Sidi").email("sidi@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamed@gmail.com").build());

        };
    }

}
