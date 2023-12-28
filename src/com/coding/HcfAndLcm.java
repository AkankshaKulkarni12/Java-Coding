package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   HCF -
*   1. Divide a number by other number until the remainder is 0.
*   2. After every operation, dividend = divisor and divisor = remainder.           [ divisor ) dividend ]
*   3. Once the remainder is 0, the divisor of that operation is the HCF.
*
*   LCM -
*   1. lcm = (num1 * num2) / hcf
*
* */

public class HcfAndLcm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // HCF
        System.out.println("HCF: " + returnHCF(num1, num2));

        // LCM
        System.out.println("LCM: " + returnLCM(num1, num2));

    }

    // HCF of 2 numbers
    static int returnHCF(int n1, int n2){
        while (n1 % n2 != 0){
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n2;
    }

    // LCM of 2 numbers
    static int returnLCM(int n1, int n2){
        int gcd = returnHCF(n1, n2);
        int lcm = (n1 * n2)/gcd;
        return lcm;
    }
}
