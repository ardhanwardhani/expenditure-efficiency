package com.simulation.expenditure_efficiency.controller;

import com.simulation.expenditure_efficiency.dto.PurchaseRequest;
import com.simulation.expenditure_efficiency.dto.PurchaseResponse;
import com.simulation.expenditure_efficiency.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public PurchaseResponse makePurchase(@RequestBody PurchaseRequest request) {
        return purchaseService.calculateBestPurchase(request);
    }
}
