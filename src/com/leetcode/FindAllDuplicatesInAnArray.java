package com.leetcode;

/*
*   442. Find All Duplicates in an Array
*
* */

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        list = findDuplicates(nums);
        System.out.println(list);
    }

    static List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicateList = new ArrayList<>();

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
            if (nums[k] != k+1){
                duplicateList.add(nums[k]);
            }
        }

        return duplicateList;
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
