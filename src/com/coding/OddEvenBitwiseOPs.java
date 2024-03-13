package com.coding;

/*
*
*   5 in binary is written as 0101
*   if the last digit (least significant bit) is 1 then the number is odd, if it is 0, then it is even.
*   AND operation is used, since it gives the same digit when & with 1.
*
* */

public class OddEvenBitwiseOPs {
    public static void main(String[] args) {
        System.out.println(odd(4));
    }

    static boolean odd(int n){
        return (n & 1) == 1;
    }
}
