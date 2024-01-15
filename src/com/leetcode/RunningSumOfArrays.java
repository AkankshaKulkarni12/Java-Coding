package com.leetcode;

/*
 *   1480. Running Sum of 1d Array
 *
 *   Problem Statement - Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * */

import java.util.Arrays;

public class RunningSumOfArrays {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        int [] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] runningSum(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++){
            nums[i + 1] = nums[i+1] + nums[i];
        }
        return nums;
    }

}
