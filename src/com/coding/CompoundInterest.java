package com.coding;

import java.util.Scanner;
/*
*   LOGIC:
*
*   Compound Interest = Principal * ((1+rate)/100)^t - Principal
*
* */
public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double principal, rate, time;

        System.out.print("Pricipal: ");
        principal = scanner.nextDouble();
        System.out.print("Rate: ");
        rate = scanner.nextDouble();
        System.out.print("Time: ");
        time = scanner.nextDouble();

        double compoundInterest = principal * Math.pow(1+rate/100, time) - principal;
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
