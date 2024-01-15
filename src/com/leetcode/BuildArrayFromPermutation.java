package com.leetcode;

/*
 *   1920. Build Array from Permutation
 *
 *   Problem Statement - Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 *  A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 *
 * */

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] array = {0,2,1,5,3,4};
        int [] arr = buildArray(array);
        System.out.println(Arrays.toString(arr));
    }

    static int[] buildArray(int[] nums) {
        int length = nums.length;
        int [] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
