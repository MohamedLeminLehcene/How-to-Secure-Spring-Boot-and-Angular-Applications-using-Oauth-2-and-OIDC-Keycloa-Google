package org.sdia.customerfrontthymeleaffapp.repositories;

import org.sdia.customerfrontthymeleaffapp.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
