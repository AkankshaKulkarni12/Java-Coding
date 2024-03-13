package com.coding;

import java.sql.Array;
import java.util.ArrayList;

public class FactorsOfNumber {
    public static void main(String[] args) {

        factors(20);
        System.out.println();
        factorsOptimized(20);
        System.out.println();
        factorsOptimized2(20);

    }

    // brute force approach
    // Complexity - O(n)
    static void factors(int n){
        for (int i=1; i<=n; i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // Optimized Approach
    // Complexity Time - O(sqrt(n))
    static void factorsOptimized(int n){
        for (int i=1; i<= Math.sqrt(n); i++){
            if (n%i ==0){
                if (n/i == i){
                    System.out.print(i + " ");
                }
                else
                    System.out.print(i + " "+ n/i + " ");
            }
        }
    }

    // printing the factors in order
    // both time and space complexity - O(sqrt(n))
    static void factorsOptimized2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<= Math.sqrt(n); i++){
            if (n%i ==0){
                if (n/i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i>=0; i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
