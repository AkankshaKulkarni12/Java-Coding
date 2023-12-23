package com.coding;

import java.util.Scanner;

/*
*   LOGIC :-
*
*   A year is a leap year if it satisfies the following conditions: -
*   1. The year should be a multiple of 400.
*   2. The year should be a multiple of 4 but not of 100.
*
* */

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year.");
        }

    }
}
