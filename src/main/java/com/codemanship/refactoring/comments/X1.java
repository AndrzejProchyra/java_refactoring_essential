package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {
        int accumulatedSum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            // Add square of each number in the range
            accumulatedSum += squareOf(i);
        }

        return accumulatedSum;
    }

    static int squareOf(int k) {
        // Return square of input
        return k * k;
    }
}
