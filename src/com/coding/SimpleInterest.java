package com.coding;

import java.util.Scanner;

/*
*   Formula:
*   SimpleInterest = (Principal * Time * Rate)/100
*
* */
public class SimpleInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        float time = scanner.nextFloat();
        int rate = scanner.nextInt();

        float simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
