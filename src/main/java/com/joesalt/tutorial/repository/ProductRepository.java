package com.joesalt.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joesalt.tutorial.model.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM product_inventory WHERE product_name = ?1", nativeQuery = true)
    List<Product> getProductsByName(String productName);
}
