package com.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n){
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
