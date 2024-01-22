package com.leetcode;

/*
*   852. Peak Index in a Mountain Array
*
* */

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 0};
        int ans = peakIndexInMountainArray(array);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end){
            
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}
