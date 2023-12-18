package org.sdia.inventoryservice;

import org.sdia.inventoryservice.entities.Product;
import org.sdia.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
          productRepository.save(Product.builder()
                          .name("Product1")
                          .price(1200.0)
                          .quantity(200)
                  .build());
          productRepository.save(Product.builder()
                          .name("Phone")
                          .price(300.0)
                          .quantity(29)
                  .build());
        };
    }
}
