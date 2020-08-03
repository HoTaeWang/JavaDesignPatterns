package com.yunsoft.Construct;

public class HelperClass {
    private HelperClass() {
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
           return true;
        }
        int squareRoot = (int)Math.sqrt(n);
        for (int i = 1; i <= squareRoot; i++) {
           if (n % i == 0 && i != 1) {
              return false;
           }
           return true;
        }
     }
}
