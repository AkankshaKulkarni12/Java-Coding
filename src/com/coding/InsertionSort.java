package com.coding;

/*
*   Insertion Sort Algorithm
*
* */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {8, 3, 9, 1, 0, 2};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int [] arr){

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
