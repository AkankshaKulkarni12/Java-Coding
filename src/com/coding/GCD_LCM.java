package com.coding;

/*
*   Euclidean Algorithm for GCD
*   gcd(a, b) = gcd(rem(b,a), a)
*
*   lcm(a, b) = a*b/gcd(a, b)
*
* */

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(2, 8));
        System.out.println(lcm(2, 8));
    }

    // GCD - using recursion (Euclidean Algorithm)
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
