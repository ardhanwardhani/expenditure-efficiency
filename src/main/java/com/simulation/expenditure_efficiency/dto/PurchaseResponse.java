package com.simulation.expenditure_efficiency.dto;

import lombok.Data;

@Data
public class PurchaseResponse {
    private int totalSpent;
    private int keyboardPrice;
    private int mousePrice;

    public PurchaseResponse(int totalSpent, int keyboardPrice, int mousePrice) {
        this.totalSpent = totalSpent;
        this.keyboardPrice = keyboardPrice;
        this.mousePrice = mousePrice;
    }
}
