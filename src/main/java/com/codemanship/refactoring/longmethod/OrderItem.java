package com.codemanship.refactoring.longmethod;

public class OrderItem {
    private final double price;
    private final double quantity;

    public OrderItem(double price, double quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
