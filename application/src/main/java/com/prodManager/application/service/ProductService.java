package com.prodManager.application.service;


import com.prodManager.application.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Integer totalStock() {
        Integer total = repository.calculateTotalStock();
        return total != null ? total : 0;
    }

    public Double totalPrice(){
        Double total = repository.calculatePriceStock();
        return total != null ? total: 0.0;
    }
}
