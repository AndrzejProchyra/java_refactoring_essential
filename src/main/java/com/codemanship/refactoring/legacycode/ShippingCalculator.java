package com.codemanship.refactoring.legacycode;

public class ShippingCalculator {

    private final OrderClient orderClient;

    public ShippingCalculator(OrderClient client) {
        orderClient = client;
    }

    public double calculateShipping(int orderId) {

        try {
            Order order = orderClient.getOrder(orderId);

            switch (order.getShippingType()) {

                case "STANDARD":
                    return order.getWeightKg() * 0.5;

                case "EXPRESS":
                    return order.getWeightKg() * 0.8
                            + order.getDistanceKm() * 0.1;

                case "OVERNIGHT":
                    return order.getWeightKg() * 1.2 + 25;

                default:
                    throw new RuntimeException(
                            "Unknown shipping type: "
                                    + order.getShippingType()
                    );
            }

        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
