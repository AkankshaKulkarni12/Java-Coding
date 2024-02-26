package com.leetcode;

/*
*   867. Transpose Matrix
*
* */

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int [][] matrix = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        int [][] ansMatrix = transpose(matrix);
        System.out.println(Arrays.deepToString(ansMatrix));

    }

    static int [][] transpose(int [][] arr){

        int m=arr.length;

        int n=arr[0].length;

        int[][] temp=new int[n][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[j][i]=arr[i][j];

            }
        }
        return temp;
    }
}
