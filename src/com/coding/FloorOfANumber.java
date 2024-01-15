package com.coding;

/*
*   Floor Of A Number
*   Floor - greatest number that is smaller or equal to target number.
*
* */

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int ans = floor(array, 15);
        System.out.println(ans);
    }

    static int floor(int [] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            // check if the target is less than the least number in the array
            if (target < arr[0]){
                return -1;
            }

            int mid = start + (end - start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                if (arr[mid] == target){
                    return mid;
                }
            }
        }
        // if while loop condition is violated.
        return end;
    }
}
