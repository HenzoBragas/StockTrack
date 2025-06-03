package com.prodManager.application.repositories;

import com.prodManager.application.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {


    @Query("SELECT SUM(p.stock) FROM product p")
    Integer calculateTotalStock();

    @Query("SELECT SUM(p.price * p.stock) FROM product p")
    Double calculatePriceStock();
}


