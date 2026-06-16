package com.codemanship.refactoring.divergentchange;

public class AccountStatusService {
    public AccountStatusService() {
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