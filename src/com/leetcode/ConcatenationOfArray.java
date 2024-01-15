package com.leetcode;

/*
 *   1929. Concatenation of Array
 *
 *   Problem Statement - Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * */

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] array = {12, 23, 34, 45, 56};
        int [] ans = getConcatenation(array);
        System.out.println(Arrays.toString(ans));

    }

    static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int [] newArr = new int[2*length];

        for (int i = 0; i < nums.length; i++){
            newArr[i + length] = newArr[i] = nums[i];

        }
        return newArr;
    }
}
