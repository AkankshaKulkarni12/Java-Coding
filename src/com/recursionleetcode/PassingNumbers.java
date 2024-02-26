package com.recursionleetcode;

public class PassingNumbers {
    public static void main(String[] args) {
        passingNum(5);
    }

    static void passingNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        passingNum(--n);
    }
}
