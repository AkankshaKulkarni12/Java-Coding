package com.leetcode;

/*
*   1572. Matrix Diagonal Sum
*   Elements should not be repeated.
*
*   Approach -
*   1. Primary Diagonal - the one where we add the values of the cells where row == col
*   2. Secondary Diagonal - the one where the sum of row + col is one less than the dimension of the matrix.
*
* */

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int [][] matrix = {{5}};
        System.out.println(diagonalSum(matrix));

    }

    static int diagonalSum(int[][] mat) {

        int sum = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (i == j){            // for primary diagonal
                    sum = sum + mat[i][j];
                }

                if (i + j == mat.length - 1 && i != j){         // for secondary diagonal without duplicates.
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
}
