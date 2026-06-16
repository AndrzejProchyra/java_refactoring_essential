package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {
        int accumulatedSum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            // Add square of each number in the range
            accumulatedSum += square(i);
        }

        return accumulatedSum;
    }

    static int square(int k) {
        // Return square of input
        return k * k;
    }
}
