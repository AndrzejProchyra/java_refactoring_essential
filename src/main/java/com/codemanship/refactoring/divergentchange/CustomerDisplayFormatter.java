package com.codemanship.refactoring.divergentchange;

public class CustomerDisplayFormatter {
    public static String format(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim().toUpperCase();
    }
}
