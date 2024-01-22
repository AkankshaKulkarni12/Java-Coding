package com.coding;

/*
*   Selection Sort Algorithm
*
* */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {8, 3, 9, 1, 0, 2};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++){

            int last = arr.length - i - 1;
            int maxIndex = maxInd(arr, 0, last);
            //swap the maxIndex and the last Index
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxInd(int [] arr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
