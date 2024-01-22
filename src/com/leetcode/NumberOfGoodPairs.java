package com.leetcode;

/*
 *   1512. Number of Good Pairs
 *
 *   Problem Statement - Given an array of integers nums, return the number of good pairs.
 *                       A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 *   Logic -
 *          1. Find the frequency of each element in the array.
 *          2. Then apply combination formula n(n-1)/2 for all the frequencies and sum it up
 * */


public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};

        // brute force
        System.out.println(goodPairs(nums));

        // optimised
        System.out.println(gooodPairs(nums));
    }

    // brute force approach
    static int goodPairs(int [] nums){
        int pairCount = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }

    // optimised approach
    static int gooodPairs(int [] arr){

        int [] individualNumCount = new int[10];

        for (int num: arr){
            individualNumCount[num]++;
        }

        int totalPairs = 0;

        for (int i: individualNumCount){
            totalPairs += (i*(i-1))/2;
        }

        return totalPairs;

    }


}
