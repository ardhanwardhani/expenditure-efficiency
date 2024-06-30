package com.simulation.expenditure_efficiency.service;

import com.simulation.expenditure_efficiency.dto.PurchaseRequest;
import com.simulation.expenditure_efficiency.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {
    public PurchaseResponse calculateBestPurchase(PurchaseRequest request) {
        int budget = request.getBudget();
        int[] keyboardPrices = request.getKeyboardPrices();
        int[] mousePrices = request.getMousePrices();

        int bestSpent = 0;
        int bestKeyboardPrice = 0;
        int bestMousePrice = 0;

        for (int keyboardPrice : keyboardPrices) {
            for (int mousePrice : mousePrices) {
                int total = keyboardPrice + mousePrice;
                if (total <= budget && total > bestSpent) {
                    bestSpent = total;
                    bestKeyboardPrice = keyboardPrice;
                    bestMousePrice = mousePrice;
                }
            }
        }

        return new PurchaseResponse(bestSpent, bestKeyboardPrice, bestMousePrice);
    }
}
