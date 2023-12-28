package com.coding;

import java.util.Scanner;

public class SumAndMultiplication {
    public static void main(String[] args) {

        // Sum of Two Number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = scanner.nextInt();
        System.out.println(addition(num1, num2));


        // Multiplication Tables
        System.out.println("Multiplication Table of: ");
        int num = scanner.nextInt();
        multiplication(num);


        // Keep taking numbers as input till user enters 'x' and print the sum of all the numbers.
        sumOfAllNumbers();

    }
    static int addition(int a, int b){
        int c = a + b;
        return c;
    }
    static void multiplication(int num){
        for(int i=1; i<=10; i++){
            int multi = num * i;
            System.out.println(multi);
        }
    }
    static void sumOfAllNumbers(){
        int input = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            input = scanner.nextInt();
            if (input != 20){
                sum = sum + input;
            }
            else {
                break;
            }
        }

        System.out.println(sum);
    }
}
