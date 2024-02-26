package com.recursionleetcode;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(1090100, 0));
    }

    static int countZeros(int n, int count){
        if (n == 0){
            return count;
        }

        int rem = n%10;
        if (rem==0){
            count++;
        }
        return countZeros(n/10, count);
    }
}
