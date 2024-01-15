package com.coding;

/*
*   Searching in 2D array
* */

import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {

        int [][] array = {{32, 13, 27}, {1, 89, 20}, {54, 61, 6}} ;
        int target = 13;

        // method 1
        System.out.println(searchIn2DArray(array, target));

        // method 2
        int [] ans = searchIn2DArray2(array, target);
        System.out.println(Arrays.toString(ans));

    }

    // Method 1 - return true or false
    static boolean searchIn2DArray(int [][] arr, int target){

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return true;
                }
            }
        }
        return false;
    }

    // Method 2  - return the row and col
    static int [] searchIn2DArray2(int [][] arr, int target){

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
