package com.codemanship.refactoring.divergentchange;

public class CustomerService {

    private final LoyaltyService loyaltyService = new LoyaltyService();

    public boolean isValidEmail(String email) {
        return EmailValidator.validate(email);
    }

    public String formatDisplayName(String firstName, String lastName) {
        return CustomerDisplayFormatter.format(firstName, lastName);
    }

    public int calculateLoyaltyPoints(int numberOfPurchases) {
        return loyaltyService.calculateLoyaltyPoints(numberOfPurchases);
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
