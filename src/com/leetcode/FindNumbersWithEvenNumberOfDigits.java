package com.leetcode;

/*
*   1295. Find Numbers with Even Number of Digits
*
*   Problem Statement - Given an array nums of integers, return how many of them contain an even number of digits.
*
* */

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] nums = {12, 3455, 40, 6, 7896};
        int countEvenNum = 0;

        for (int num: nums){
            if(isEven(countDigits(num))){
                countEvenNum++;
            }
        }
        System.out.println(countEvenNum);
    }

    // count the digits of the individual number
    static int countDigits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    // check if digit count is even or not
    static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
}
