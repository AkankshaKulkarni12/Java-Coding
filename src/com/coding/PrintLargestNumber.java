package com.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // For 2 numbers
        System.out.println(printGreaterNumber(num1, num2));

        // For 3 numbers
        System.out.println(printLargestOfThree(num1, num2, num3));

        // For 3 numbers using Collections
        printLargestNumberUsingCollections(num1, num2, num3);
    }

    // For 2 numbers
    static int printGreaterNumber(int n1, int n2){
        if(n1 > n2){
            return n1;
        }
        else {
            return n2;
        }
    }

    // Method 1: For 3 numbers
    static int printLargestOfThree(int n1, int n2, int n3) {

        if(n1 >= n2 && n1 >= n3){
            return n1;
        }
        else if (n2 >= n1 && n2 >= n3) {
            return n2;
        }
        else {
            return n3;
        }
    }

    // Method 2: For 3 numbers using Collections
    static void printLargestNumberUsingCollections(int n1, int n2, int n3){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(n1);
        arrList.add(n2);
        arrList.add(n3);

        System.out.println("The largest number is: " + Collections.max(arrList));
    }
}
