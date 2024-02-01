package com.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(4);
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            //for every row, run the column
            for (int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
