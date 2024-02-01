package com.leetcode;

/*
*   1252. Cells with Odd Values in a Matrix
*
* */

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int [][] indices = {{1, 1}, {0, 0}};
        int ans = oddCells(2, 2, indices);
        System.out.println(ans);
    }

    static int oddCells(int m, int n, int[][] indices) {
        int [][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++){
            // keeping the rows constant
            for (int j=0; j < n ; j++){
                matrix[indices[i][0]][j]++;
            }

            // keeping the columns constant
            for (int k = 0; k < m; k++){
                matrix[k][indices[i][1]]++;
            }
        }

        // counting the number of odd entries
        int oddNums = 0;
        for (int [] arr: matrix){
            for (int num: arr){
                if (num%2 != 0){
                    oddNums++;
                }
            }
        }
        return oddNums;
    }

}

