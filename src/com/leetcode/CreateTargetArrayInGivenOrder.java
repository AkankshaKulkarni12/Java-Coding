package com.leetcode;

/*
*   1389. Create Target Array in the Given Order
*
*   Problem Statement -
*
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] ans = createTargetArray(nums, index);
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(ans);

        System.out.println(Arrays.toString(ans));
    }

    static int [] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> ans = new ArrayList();
        int [] finalAns = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans.add(index[i], nums[i]);
        }

        int k = 0;
        for(int num:ans){
            finalAns[k++] = num;
        }
        return finalAns;
    }

//    static int rotate(int [] arr){
//
//    }
}
