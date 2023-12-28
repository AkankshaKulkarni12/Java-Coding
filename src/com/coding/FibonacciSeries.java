package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   1. Fibonacci Numbers are the numbers in the following sequence
*       0, 1, 1, 2, 3, 5, 8, ... and so on
*
*       f1 = 0, f2 = 1 then f3 = f1 + f2 (0+1 = 1)
*       f1 = 1, f2 = 1 then f3 = f1 + f2 (1+1 = 2)
*       f1 = 1, f2 = 2 then f3 = f1 + f2 (1+2 = 3)
*
* */

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Fibonacci Without Recursion
        fibonacciWithoutRecursion(n);
    }

    static void fibonacciWithoutRecursion(int n){
        int f1 = 0;
        int f2 = 1;

        System.out.println(f1);
        System.out.println(f2);

        for(int i = 0; i < n-2; i++){
            int fibo = f1 + f2;
            System.out.println(fibo);
            f1 = f2;
            f2 = fibo;
        }
    }
}
