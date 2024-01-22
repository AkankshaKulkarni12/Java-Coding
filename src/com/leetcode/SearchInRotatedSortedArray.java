package com.leetcode;

/*
*   33. Search in Rotated Sorted Array (Only for distinct values)
*       Since it is a sorted array - apply binary search
*       step 1: find the pivot  (pivot -> largest element)
*       step 2: search in the first half -> (0, pivot)
*       step 3: search in the second half -> (pivot+1, arr.length - 1)
*
* */

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
//        int ans = findPivot(nums);

        System.out.println(search(nums, 1));
//        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        // if array is not rotated
        int pivot = findPivot(nums);
        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is the target itself
        if (nums[pivot] == target){
            return pivot;
        }

        // if target is >= start
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int [] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end-start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            }
            else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        // array is not rotated
        return -1;
    }

}
