package com.zk.store;

public class OrderService
{
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public void placeOrder()
    {
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
}
