package com.leetcode;

/*
*   1732. Find the Highest Altitude
*
* */

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int [] gain = {-5,1,5,0,-7};

        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain){

        int sum = 0;
        int max = 0;
        for(int num: gain){
            sum = sum + num;
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }

}
