package com.leetcode;

/*
*   448. Find All Numbers Disappeared in an Array
*
* */

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        list =findAllNumbersDisappeared(nums);
        System.out.println(list);
    }

    static List<Integer> findAllNumbersDisappeared(int [] arr){

        List<Integer> disappearedNumbers = new ArrayList<>();

        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        for (int k = 0; k < arr.length; k++){
            if (arr[k] != k + 1){
                disappearedNumbers.add(k+1);
            }
        }
        return disappearedNumbers;
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
