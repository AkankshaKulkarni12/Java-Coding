package com.coding;

/*
*   Find the unique element in the array.
*
*   XOR properties -
*   (a ^ 0 = a) any number XORed with 0 gives that number.
*   (a ^ a = 0) any number XORed with itself gives zero.
*
* */

public class FindUniqueXOROp {
    public static void main(String[] args) {
        int [] array = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findUnique(array));
    }

    static int findUnique(int [] arr){
        int unique = 0;

        for (int num: arr){
            // XOR operation
            unique^=num;
        }

        return unique;
    }

}
