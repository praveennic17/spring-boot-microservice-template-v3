package com.example.orderservice.service.impl;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String placeOrder(OrderDto order) {
        return "Order placed for: " + order.getProduct() + ", Quantity: " + order.getQuantity();
    }
}
