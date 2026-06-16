package com.codemanship.refactoring.legacycode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShippingCalculatorTest {

    @Test
    void calculatesStandardShippingType() {
        OrderClient client = (orderId -> new Order(
                1001,
                "STANDARD",
                5.0,
                1.0,
                false));
        ShippingCalculator calculator = new ShippingCalculator(client);

        double shippingCost = calculator.calculateShipping(1001);

        assertEquals(2.5, shippingCost);
    }

    @Test
    void calculatesExpressShippingType() {
        OrderClient client = (orderId -> new Order(
                1001,
                "EXPRESS",
                42.5,
                28.0,
                false));
        ShippingCalculator calculator = new ShippingCalculator(client);

        double shippingCost = calculator.calculateShipping(1001);

        assertEquals(36.8, shippingCost);
    }

    @Test
    void calculatesOvernightShippingType() {
        OrderClient client = (orderId -> new Order(
                1001,
                "OVERNIGHT",
                2.0,
                28.0,
                false));
        ShippingCalculator calculator = new ShippingCalculator(client);

        double shippingCost = calculator.calculateShipping(1001);

        assertEquals(27.4, shippingCost);
    }

    @Test
    void shippingIsMinusOneOnUnknownShippingType() {
        OrderClient client = (orderId -> new Order(
                1001,
                "UNKNOWN_TYPE",
                2.0,
                28.0,
                false));
        ShippingCalculator calculator = new ShippingCalculator(client);

        double shippingCost = calculator.calculateShipping(1001);

        assertEquals(-1.0, shippingCost);
    }
}
