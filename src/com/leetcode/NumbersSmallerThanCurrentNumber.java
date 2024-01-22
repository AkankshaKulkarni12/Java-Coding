package com.leetcode;

/*
*   1365. How Many Numbers Are Smaller Than the Current Number
*
*   Problem Statement - Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
*
* */

import java.util.Arrays;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        int [] ans = numbersSmallerThanCurrentNum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int [] numbersSmallerThanCurrentNum(int [] arr){
        int [] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            int freq = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    freq++;
                }
            }
            count[i] = freq;
        }
        return count;
    }

}
