package com.example.orderservice.dto;

public class OrderDto {
    private String product;
    private int quantity;

    // Getters and setters
    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
