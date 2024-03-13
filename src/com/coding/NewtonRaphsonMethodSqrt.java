package com.coding;

/*
*   Newton Raphson Method for finding the Square root of a Number
*   Formula -
*   root = (X + (N/X))/2, where
*
*   root = actual sq root of the number
*   X = any number assumed as a sqrt
*   error = | root - X |
*   We have to keep the error minimum.
*
*   Steps -
*   1. Assign X to N
*   2. You will find the answer when error is < 1.
*   3. Update the value of X = root
*
*   Complexity -
*   O((log N) f(N))
*   f(N) = cost of calculating f(N)/f'(N) with n-digit precision.
*
* */

public class NewtonRaphsonMethodSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x + (n/x));

            if (Math.abs(root-x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
