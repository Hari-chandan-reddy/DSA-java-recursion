package com.dsa.recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sum(19));
    }

    static int sum(int n) {
        if(n <= 1) {
            return n;
        }

        return n + sum(n - 1);
    }
}
