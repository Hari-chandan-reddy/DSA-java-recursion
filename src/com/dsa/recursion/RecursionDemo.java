package com.dsa.recursion;

public class RecursionDemo {
    public static void main(String[] args) {
        //printFor(5);
        //printRev(5);
        //printBoth(5);
        passDecrement(5);
    }

    static void passDecrement(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);

        // infinite loop(StackOverflowError): 'n--'(post decrement) passes 'n' value first and then subtracts by '1'.
        //passDecrement(n--);

        // No StackOverflowError: '--n'(pre decrement) subtracts 'n' by '1' and then passes 'n'.
        passDecrement(--n);
    }

     static void printFor(int n) {
//        if(n == 0) {
//            return;
//        }

        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printFor(n - 1);
    }

    static void printRev(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        printRev(n - 1);
        System.out.println(n);
    }

    static void printBoth(int n) {
//        if(n == 1) {
//            System.out.println(n);
//            return;
//        }

        if(n == 0) {
            return;
        }

        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}