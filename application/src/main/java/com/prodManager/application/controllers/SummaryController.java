package com.prodManager.application.controllers;

import com.prodManager.application.dtos.StockSummaryDTO;
import com.prodManager.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summary")
public class SummaryController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<StockSummaryDTO> getFullSummary() {
        Integer total = service.totalStock();
        Double price = service.totalPrice();
        return ResponseEntity.ok(new StockSummaryDTO(total, price));
    }
}
