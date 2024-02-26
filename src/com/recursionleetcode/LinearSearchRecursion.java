package com.recursionleetcode;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class LinearSearchRecursion {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int [] array = {2, 4, 11, 45, 5, 5};
//        System.out.println(isLinear(array, 11, 0));
//        System.out.println(find(array, 5, 0));
        findAllIndex(array, 5, 0);
        System.out.println(list);
    }

    static boolean isLinear(int [] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || isLinear(arr, target, index+1);
    }

    static int find(int [] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        else {
            return find(arr, target, index+1);
        }
    }


    static void findAllIndex(int [] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    // returning the ArrayList
    static ArrayList<Integer> findTheIndex(int [] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return findTheIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findTheIndex2(int [] arr, int target, int index){

        ArrayList<Integer> list2 = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findTheIndex2(arr, target, index+1);
        list2.addAll(ansFromBelowCalls);

        return list2;
    }
}
