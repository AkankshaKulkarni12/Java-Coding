package com.recursionleetcode;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = addition(1234);
        System.out.println(ans);
    }

    static int addition(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + addition(n/10);
    }
}
