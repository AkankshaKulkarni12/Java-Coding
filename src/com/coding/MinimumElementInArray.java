package com.coding;

/*
*   Q. Find the Minimum element in the array
*
* */

public class MinimumElementInArray {
    public static void main(String[] args) {
        int [] array = {32, 13, 5, 89, 54, 12, 98, 10};

        int [][] array2D = {{27, 13, 1}, {32, 45, 78}, {98, 101, 133}};

        // 1D Array
        System.out.println(minimumNumber(array));

        // 2D Array
        System.out.println(minimumNumber2(array2D));
    }

    // minimum element in 1D array
    static int minimumNumber(int [] arr){

        int min = arr[0];
        for (int num:arr){
            if (num < min){
                min = num;
            }
        }

        return min;
    }

    //minimum element in 2D array
    static int minimumNumber2(int [][] arr){

        int min = Integer.MAX_VALUE;
        for (int [] array: arr){
            for (int element: array){
                if (element < min){
                    min = element;
                }
            }
        }
        return min;
    }
}
