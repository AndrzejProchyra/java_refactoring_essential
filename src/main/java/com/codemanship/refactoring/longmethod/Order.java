package com.codemanship.refactoring.longmethod;

import java.util.List;

public class Order {

    private final List<OrderItem> items;
    private final Customer customer;

    public Order(List<OrderItem> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public OrderSummary summarise() {
        validate();

        double subtotal = getSubtotal();

        double discount = getDiscount(subtotal);

        double taxableAmount = subtotal - discount;
        double tax = getTax(taxableAmount);

        double total = getTotal(taxableAmount, tax);

        return new OrderSummary(subtotal, discount, tax, total);
    }

    private static double getTax(double taxableAmount) {
        return taxableAmount * 0.20;
    }

    private static double getTotal(double taxableAmount, double tax) {
        return taxableAmount + tax;
    }

    private double getDiscount(double subtotal) {
        double discount = 0.0;
        if (customer.isLoyal()) {
            discount = subtotal * 0.10;
        } else if (subtotal > 100) {
            discount = subtotal * 0.05;
        }
        return discount;
    }

    private double getSubtotal() {
        double subtotal = 0.0;
        for (OrderItem item : items) {
            subtotal += item.getPrice() * item.getQuantity();
        }
        return subtotal;
    }

    private void validate() {
        if (items == null) {
            throw new IllegalStateException("Items cannot be null");
        }
        if (items.isEmpty()) {
            throw new IllegalStateException("Order must contain items");
        }
    }
}
