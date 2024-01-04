package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   Combinations -> nCr = n!/r!(n-r)!
*   Permutations -> nPr = n!/(n-r)!
*
* */

public class PermutationsAndCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;

        System.out.println("Enter n: ");
        n = scanner.nextInt();
        System.out.println("Enter r: ");
        r = scanner.nextInt();

        System.out.println("nCr: " + printnCr(n, r));
        System.out.println("nPr: " + printnPr(n, r));

    }

    static int printnCr(int n, int r){
        int nCr = factorial(n) / (factorial(r) * factorial(n-r));
        return nCr;
    }

    static int printnPr(int n, int r){
        int nPr = factorial(n) / factorial(n-r);
        return nPr;
    }

    static int factorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
