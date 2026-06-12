package com.codemanship.refactoring.divergentchange;

public class CustomerService {

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public String formatDisplayName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim().toUpperCase();
    }

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return numberOfPurchases * 10;
    }

    public String determineAccountStatus(int daysSinceLastLogin) {
        if (daysSinceLastLogin > 365) {
            return "INACTIVE";
        } else if (daysSinceLastLogin > 30) {
            return "DORMANT";
        }
        return "ACTIVE";
    }
}
