package com.recursionleetcode;

public class PrintNtoOne {
    public static void main(String[] args) {
//        print(5);
//        printReverse(5);
        printIncToDec(5);
    }

    // print numbers from n to 1
    static void print(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        print(n-1);
    }

    // print numbers from 1 to n
    static void printReverse(int n){
        if (n==0){
            return;
        }
        printReverse(n-1);
        System.out.println(n);
    }

    static void printIncToDec(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printIncToDec(n-1);
        System.out.println(n);
    }
}
