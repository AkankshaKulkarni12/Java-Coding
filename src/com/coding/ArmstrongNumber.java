package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   1. Armstrong Number = It is a number which is equal to the sum of the cubes of the digits of the number.
*   example - 153
*             (1*1*1) + (5*5*5) + (3*3*3) = 153
*
*
* */
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int oriNum = num;
        int sum = 0;

        while (num != 0){
            int rem = num % 10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }

        if (oriNum == sum){
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
