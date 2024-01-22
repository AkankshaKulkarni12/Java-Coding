package com.coding;

import java.util.Arrays;

/*
*   Bubble Sort Algorithm
*
*   Bubble Sort works by repeatedly swapping the adjacent elements if they are in the wrong order.
*   In this, the largest element is moved to the rightmost end.
*   Complexity - O(n^2)
*   Total passes - n-1
*   Total no of Comparisons - n(n-1)/2
*
* */

public class BubbleSort {
    public static void main(String[] args) {
        // unsorted array
        int [] array = {8, 3, 9, 1, 0, 2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        // sorted array
        int [] array2 = {1, 2, 3, 4, 5};
        bubbleSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    // Bubble Sort Implementation
    static void bubbleSort(int [] arr){
        // if the array is already sorted, break the loop using the boolean value
        boolean swapped;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            // inner comparisons
            for (int j = 1; j < arr.length - i; j++){
                // swap the elements if the element is smaller than the previous element
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if the swapping does not occur in the first pass, then break the loop
            if (!swapped){
                break;
            }
        }

    }
}
