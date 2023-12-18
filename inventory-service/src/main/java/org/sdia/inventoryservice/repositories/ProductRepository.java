package org.sdia.inventoryservice.repositories;

import org.sdia.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
