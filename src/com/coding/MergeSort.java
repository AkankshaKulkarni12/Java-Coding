package com.coding;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
//        int [] ans = mergeSort(arr);
//        System.out.println(Arrays.toString(ans));

        // merge sort in place
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int [] mergeSort(int [] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int [] merge(int [] first, int [] second){
        int [] finalArr = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                finalArr[k] = first[i];
                i++;
            } else {
                finalArr[k] = second[j];
                j++;
            }
            k++;
        }

        // if one of the array reaches the end
        while (i < first.length){
            finalArr[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            finalArr[k] = second[j];
            j++;
            k++;
        }

        return finalArr;
    }


    // Merge Sort in place
    static void mergeSortInPlace(int [] arr, int s, int e){
        if (e-s == 1){
            return;
        }

        int mid = (s+e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int [] arr, int s, int m, int e){
        int [] finalArr = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                finalArr[k] = arr[i];
                i++;
            } else {
                finalArr[k] = arr[j];
                j++;
            }
            k++;
        }

        // if one of the array reaches the end
        while (i < m){
            finalArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            finalArr[k] = arr[j];
            j++;
            k++;
        }

        for (int l=0; l< finalArr.length; l++){
            arr[s+l] = finalArr[l];
        }

    }
}
