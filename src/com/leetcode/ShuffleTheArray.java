package com.leetcode;

/*
 *   1470. Shuffle the Array
 *
 *   Problem Statement - Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *                       Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * */

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};
        int [] ans = shuffle(nums, 3);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int [] newArr = new int[2*n];

        for (int i = 0; i < n; i++){
            newArr[2*i] = nums[i];
            newArr[2*i + 1] = nums[i+n];
        }
        return newArr;
    }
}
