package com.coding;

/*
*   LOGIC:
*
*   Linear Searching -
*   Linear Search is the sequential search that starts from the first element of an array and checks the presence of the required element over the entire array.
*
* */

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {20, 34, 12, 13, 78};
        int num = 13;
        int ans = linearSearch(arr, num);
        System.out.println(ans);
    }

    static int linearSearch(int [] array, int target) {
        // check the length of array
        if (array.length == 0) {
            return -1;
        }

        // compare every array element to the target and return the index where it matches
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element == target) {
                return i;
            }
        }

        // if no element in array matches to the target, then element not found
        return -1;
    }
}
