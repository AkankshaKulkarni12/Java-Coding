package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   Pick a single character from the end of the string to the beginning one by one.
*   Create an empty string variable and concatenate it the characters to the string.
*
* */

public class ReverseAString {
    public static void main(String[] args) {

//        String str = "Hello";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.next();

        System.out.println(reverseString(str));
    }

    static String reverseString(String str){
        String revStr = "";

        for (int i = str.length() - 1; i >=0; i--){
            char ch = str.charAt(i);
            revStr = revStr + ch;
        }
        return revStr;
    }
}
