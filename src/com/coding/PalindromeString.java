package com.coding;

import java.util.Locale;

/*
*   LOGIC:
*
*   1. Palindrome - A string is said to be palindrome if it remains the same on reading from both ends.
*   Examples - radar, mom, wow, etc.
*
* */

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Akanksha";
        str = str.toLowerCase();

        // Method 1 - Using Reverse String and equals
        palindromeUsingRevString(str);

        // Method 2 - Using Boolean value
        palindromeUsingBool(str);

    }


    // Method 1 - Using Reverse String and equals
    static void palindromeUsingRevString(String str){
        String str1 = "";
        for (int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            str1 = str1 + ch;
        }

        if(str.equals(str1)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    // Method 2 - Using Boolean value
    static void palindromeUsingBool(String str){
        boolean flag = true;

        for (int i = 0; i < str.length()/2; i++){
            char ch = str.charAt(i);
            char ch2 = str.charAt(str.length()-1-i);
            if(ch != ch2){
                flag = false;
                break;
            }
        }

        if(flag == false){
            System.out.println("String is not a Palindrome.");
        }
        else {
            System.out.println("String is a Palindrome.");
        }
    }
}
