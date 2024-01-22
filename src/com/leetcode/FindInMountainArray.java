package com.leetcode;

/*
*   1095. Find in Mountain Array
*
* */

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] array = {0,1,2,4,2,1};
        int index = findInMountainArray(3, array);
        System.out.println(index);
    }

    static int findInMountainArray(int target, int [] mountainArr){
        int peak = findPeakElement(mountainArr);
        int binSearch = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (binSearch != -1){
            return binSearch;
        }
        return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
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

    static int orderAgnosticBinarySearch(int [] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end-start)/2;

            // if mid element is equal to target element
            if (arr[mid] == target){
                return mid;
            }

            // if array is in ascending order
            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            // if array is in descending order
            else {
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


}
