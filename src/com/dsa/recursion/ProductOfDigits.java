package com.dsa.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(369));
    }

    static int sumOfDigits(int n) {
//        if(n == 0) {
//            return 1;
//        }

        if((n % 10) == n) {
            return n;
        }

        return (n % 10) * sumOfDigits(n / 10);
    }
}
