package com.simulation.expenditure_efficiency.dto;

import lombok.Data;

@Data
public class PurchaseRequest {
    private int budget;
    private int[] keyboardPrices;
    private int[] mousePrices;
}
