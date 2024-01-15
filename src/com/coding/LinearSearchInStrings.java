package com.coding;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name = "Akanksha";
        char target = 'n';

        // for loop
        System.out.println(stringSearch1(name, target));

        // forEach loop
        System.out.println(stringSearch2(name, target));

    }

    // Method 1 - using for loop
    static boolean stringSearch1(String str, char ch){
        for (int i = 0; i < str.length(); i++){
            char isChar = str.charAt(i);
            if (isChar == ch){
                return true;
            }
        }
        return false;
    }

    // Method 2 - using forEach loop
    static boolean stringSearch2(String str, char ch){
        for (char isChar: str.toCharArray()){
            if (isChar == ch){
                return true;
            }
        }

        return false;
    }
}
