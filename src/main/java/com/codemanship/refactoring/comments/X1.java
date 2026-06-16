package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {
        int p = 0;

        // Iterate from lower bound (q) to upper bound (z)
        for (int i = lowerBound; i <= upperBound; i++) {
            // Add square of each number in the range
            p += n(i);
        }

        // Return accumulated sum
        return p;
    }

    static int n(int k) {
        // Return square of input
        return k * k;
    }
}
