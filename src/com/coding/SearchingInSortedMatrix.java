package com.coding;

/*
*   Searching In A Sorted Array
*
*   Case 1: if element == target        // ans found
*
*   Case 2: if element > target
*           eliminate all the rows after the row of the current element
*
*   Case 3: if element < target
*           eliminate the rows above
*
*
* */

import javax.imageio.ImageTranscoder;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingInSortedMatrix {
    public static void main(String[] args) {
        int [][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(array, 3)));
    }

    // search in the row provided
    static int [] simpleBinarySearch(int [][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int []{-1, -1};
    }

    static int [] search(int [][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (columns == 0){
            return new int[]{-1, -1};
        }
        if (rows == 1){
            return simpleBinarySearch(matrix, 0, 0, columns - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns/2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;

            if (matrix[mid][cMid] ==  target){
                return new int [] {mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }

        // search in all the 4 sections

        if (target <= matrix[rStart][cMid-1]){
            return simpleBinarySearch(matrix, rStart, 0, cMid-1, target);
        }
        if (target >= matrix[rStart][cMid+1]){
            return simpleBinarySearch(matrix, rStart, cMid+1, columns-1, target);
        }
        if (target <= matrix[rStart+1][cMid-1]){
            return simpleBinarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        else {
            return simpleBinarySearch(matrix, rStart+1, cMid+1, columns-1, target);
        }


    }
}
