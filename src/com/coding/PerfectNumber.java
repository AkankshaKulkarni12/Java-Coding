package com.coding;

/*
*   LOGIC:
*
*   Perfect Number:- A number whose sum of factors (excluding the number itself) is equal to the number is called the perfect number.
*   example: 28
*           factors = 1,2,4,7,14. (excluding 28)
*
* */
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;

        isPerfectNumber(num);
    }

    static void isPerfectNumber(int n){

        int sum = 0;
        int i = 2;
        while (i <= n){
            if(n % i == 0){
                sum = sum + (n/i);
            }
            i++;
        }

        if(sum == n){
            System.out.println("Perfect Number.");
        }
        else {
            System.out.println("Not a Perfect Number.");
        }
    }
}
