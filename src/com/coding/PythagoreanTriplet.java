package com.coding;

import java.util.Scanner;

/*
*   LOGIC:
*
*   To check if the given triplet is Pythagorean Triplet or not.
*   Pythagorean Triplet can be checked if:
*       a^2 + b^2 = c^2
*
*   where  a = side1, b = side2
*          c = hypotenuse
*
* */

public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(isPythagoreanTriplet(a, b, c));

    }

    static boolean isPythagoreanTriplet(int side1, int side2, int hyp){
        return ((side1*side1) + (side2*side2) == (hyp*hyp));
    }
}
