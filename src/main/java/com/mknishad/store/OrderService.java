package com.mknishad.store;

import org.springframework.core.annotation.Order;

public class OrderService {
    private final PaymentService paymentService;

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(100.0);
    }
}
