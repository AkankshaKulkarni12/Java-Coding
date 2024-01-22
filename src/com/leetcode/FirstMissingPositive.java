package com.leetcode;

/*
*   41. First Missing Positive
*
* */

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {1,2,0};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        // search for missing element
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                return index + 1;
            }
        }

        //case 2
        return nums.length + 1;
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
