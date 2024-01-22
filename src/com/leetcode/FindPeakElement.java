package com.leetcode;

/*
*   162. Find Peak Element
*
* */

public class FindPeakElement {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 0};
        int ans = findPeakElement(array);
        System.out.println(ans);
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){

            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
