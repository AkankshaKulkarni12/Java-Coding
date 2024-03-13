package com.recursionleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] array = {1, 2, 2};
        System.out.println(subset(array));
        System.out.println(subsetDuplicates(array));
    }


    // list inside a list - subsets
    // Time - O(N * 2^n)    Space - O(2^n * n)
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num: arr){
            int n = outer.size();
            for (int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


    // subsets of duplicates
    static List<List<Integer>> subsetDuplicates(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i=0; i < arr.length; i++){
            start=0;
            // if current and previous element is same, s = e + 1
            if (i >0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j=start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
