package com.coding;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {2, 3, 5, 6, 12, 34, 56, 87, 98};
        int ans = binarySearchIn1DArray(array, 12);
        System.out.println(ans);

    }

    // return the index of the element and return -1 if it does not exist.
    static int binarySearchIn1DArray(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

//            int mid = (start + end) / 2;      For large values might exceed integer limits
            int mid = start + (end-start)/2;

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
//                arr[mid] == target
                return mid;
            }
        }
        return -1;
    }

}
