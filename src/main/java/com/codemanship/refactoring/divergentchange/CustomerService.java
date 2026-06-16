package com.codemanship.refactoring.divergentchange;

public class CustomerService {

    public boolean isValidEmail(String email) {
        return EmailValidator.validate(email);
    }

    public String formatDisplayName(String firstName, String lastName) {
        return CustomerDisplayFormatter.format(firstName, lastName);
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
