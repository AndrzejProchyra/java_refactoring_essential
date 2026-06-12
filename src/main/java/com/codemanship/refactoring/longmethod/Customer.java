package com.codemanship.refactoring.longmethod;

public class Customer {
    private final boolean loyal;

    public Customer(boolean loyal) {
        this.loyal = loyal;
    }

    public boolean isLoyal() {
        return loyal;
    }
}
