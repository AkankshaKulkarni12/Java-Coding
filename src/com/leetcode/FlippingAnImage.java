package com.leetcode;

/*
*   832. Flipping an Image
*
*                       Flip horizontally    Invert
*       1 1 0           0 1 1               1 0 0
*       1 0 1   --->    1 0 1   --->        0 1 0
*       0 0 0           0 0 0               1 1 1
* */

import java.util.ArrayList;
import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][] matrix = { {1, 1, 0},
                            {1, 0, 1},
                            {0, 0, 0}};

        int [][] ans = flipAndInvertImage(matrix);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image){
        int s = image[0].length;

        for (int [] row: image){

            for (int i = 0; i < (s+1)/2; i++){
                int temp = row[i]^1;
                row[i] = row[s-i-1]^1;
                row[s-i-1] = temp;
            }

        }
        return image;
    }
}
