package com.coding;

/*   Order Agnostic Binary Search:
 *   1. An algorithm where we do not know whether the given array is sorted or not.
 *   2. The array can be either in ascending or descending order.
 *   3. To find it is ascending or descending:-
 *       Compare start and end of the array
 *       if (start > end), then descending order
 *       if (end > start), then ascending order
 */

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {12, 23, 34, 45, 56, 66, 67, 78, 89};
        int [] arr2 = {90, 89, 78, 67, 56, 55, 45, 34, 23};

        System.out.println(orderAgnosticBinarySearch(arr, 34));
        System.out.println(orderAgnosticBinarySearch(arr2, 34));
    }

    static int orderAgnosticBinarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

//        if (arr[start] < arr[end]){
//            isAsc = true;
//        }
//        else {
//            isAsc = false;
//        }

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
