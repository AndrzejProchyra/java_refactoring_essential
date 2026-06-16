package com.codemanship.refactoring.divergentchange;

public class LoyaltyService {
    public LoyaltyService() {
    }

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return numberOfPurchases * 10;
    }
}