package com.codemanship.refactoring.comments;

public class X1 {

    static int sumOfTheSquaresBetween(int lowerBound, int upperBound) {
        int accumulatedSum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            accumulatedSum += squareOf(i);
        }

        return accumulatedSum;
    }

    static int squareOf(int k) {
        return k * k;
    }
}
