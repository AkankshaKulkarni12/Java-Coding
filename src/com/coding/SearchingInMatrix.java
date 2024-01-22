package com.coding;

/*
*   Searching In A 2D Matrix
*   It is a row-wise and column-wise sorted matrix.
*
* */

import java.util.Arrays;

public class SearchingInMatrix {
    public static void main(String[] args) {
        int [][] matrix = { {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {28, 29, 37, 49},
                            {33, 34, 38, 50} };

        System.out.println(Arrays.toString(search(matrix, 50)));
    }

    static int [] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0){

            // return the position if current num == target
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            // if the value is less than the target, eliminate the row
            if (matrix[r][c] < target){
                r++;
            }
            // if the value is greater than the target, eliminate the column
            else {
                c--;
            }
        }
        // if target not found, then return negative
        return new int[]{-1, -1};
    }
}
