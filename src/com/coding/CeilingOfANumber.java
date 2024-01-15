package com.coding;

/*
*   Ceiling of A Number
*   Ceiling - Smallest element in an array, greater or equal to the target element.
*
* */

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int ans = ceiling(array, 15);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // if target is greater than the greatest number in array
            if (target > arr[arr.length-1]){
                return -1;
            }

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                if (arr[mid] == target) {
                    return mid;
                }
            }
        }
        // if while loop condition is violated.
        return start;
    }
}
