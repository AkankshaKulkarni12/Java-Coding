package com.leetcode;

/*
*   287. Find the Duplicate Number
*
* */

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++){
            if (nums[k] != k + 1){
                return nums[k];
            }
        }
        return -1;
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
