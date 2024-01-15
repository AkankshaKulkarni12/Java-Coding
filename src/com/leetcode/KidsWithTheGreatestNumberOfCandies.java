package com.leetcode;

/*
 *   1431. Kids With the Greatest Number of Candies
 *
 *   Problem Statement - There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int [] candies = {4, 2, 1, 1, 2};

        // Using Arrays
        boolean [] bool = kidsWithCandies(candies, 1);
        System.out.println(Arrays.toString(bool));

        // Using List
        List<Boolean> ans = kidsWitCandies(candies, 1);
        System.out.println(ans);
    }

    // Using Arrays
    static boolean [] kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        boolean [] ansArr = new boolean[length];

        int max = Arrays.stream(candies).max().getAsInt();

        for (int i = 0; i < length; i++){
            if (candies[i] + extraCandies >= max){
                ansArr[i] = true;
            }
            else {
                ansArr[i] = false;
            }
        }
        return ansArr;
    }

    // Using List
    static List<Boolean> kidsWitCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        ArrayList<Boolean> ansArr = new ArrayList<Boolean>(length);

        int max = Arrays.stream(candies).max().getAsInt();

        for (int i = 0; i < length; i++){
            if (candies[i] + extraCandies >= max){
                ansArr.add(true);
            }
            else {
                ansArr.add(false);
            }
        }
        return ansArr;
    }
}
