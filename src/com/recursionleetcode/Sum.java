package com.recursionleetcode;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(4);
        System.out.println(ans);
    }

    // sum of N numbers
    static int sum(int n){
        if (n ==1 || n==0){
            return 1;
        }
        return n + sum(n-1);
    }
}
