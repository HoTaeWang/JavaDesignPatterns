package com.yunsoft.Construct;

public final class HelperClass {
    private HelperClass() {
    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if(n%2 == 0) return false;

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 3; i <= squareRoot; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // Returns nthPrimeNumber
    public static int nthPrimeNumber(int n) {
        int k = 0;
        for (int i = 2;; i++) {
            if (isPrime(i))
                k++;
            if (k == n)
                return i;
        }
    }

    public static boolean isPositive(int number) {
        if (number >= 0) return true;
        return false;
    }

}
