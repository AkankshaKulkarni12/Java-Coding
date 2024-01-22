package com.coding;

/*
*   LOGIC:  Rotation Count In A Rotated Array
*   The rotation is pivot + 1 times.
*
* */

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 8, 0, 1, 2};
        System.out.println(rotationCount(arr));
    }

    static int rotationCount(int [] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // for distinct values
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
