package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   If the number is entirely divisble by 2 (i.e, remainder is 0) then it is even, if not it is odd.
*
* */

public class EvenOROdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        printEvenOrOdd(num);
    }

    static void printEvenOrOdd(int n1){
        if (n1 % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
