package com.coding;

/*
*   Cyclic Sort
*
* */

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] array = {5, 4, 3, 2, 1};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
