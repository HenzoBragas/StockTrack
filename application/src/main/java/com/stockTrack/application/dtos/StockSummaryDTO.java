package com.stockTrack.application.dtos;

import lombok.Getter;

@Getter
public class StockSummaryDTO {
    private Integer totalStock;
    private Double totalPrice;

    public StockSummaryDTO(Integer totalStock, Double totalPrice) {
        this.totalStock = totalStock;
        this.totalPrice = totalPrice;
    }
}
