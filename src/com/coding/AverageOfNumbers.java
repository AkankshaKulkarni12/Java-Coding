package com.coding;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {

        System.out.println(averageOfNNumbers());

    }

    static int averageOfNNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number of numbers to be averaged: ");
        int noOfNum = scanner.nextInt();

        for (int i = 0; i <noOfNum; i++){
            int num = scanner.nextInt();
            sum = sum + num;
        }

        int average = sum/noOfNum;
        return average;
    }
}
