package com.leetcode;

/*
*   268. Missing Number (Amazon Question)
*
*   Problem Statement - Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*
* */

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {3, 0, 1, 2};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int [] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }
        }

        // search for missing element
        for (int index = 0; index < arr.length; index++){
            if (arr[index]!=index){
                return index;
            }
        }

        //case 2
        return arr.length;
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
