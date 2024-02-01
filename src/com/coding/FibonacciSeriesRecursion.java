package com.coding;

/*
*   Fibonacci Numbers : Recursion
*
* */

public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
//        System.out.println(fibo(6));
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n){

        if (n < 2){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
