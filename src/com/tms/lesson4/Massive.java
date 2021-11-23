package com.tms.lesson4;

import java.util.Arrays;

public class Massive {

    public int[] massive;
    public Massive(int[] massive){
        this.massive=massive;
    }
    public void massMaxElFind(int[] arr){
        int max=0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
    public void massSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int left = arr[i];
                int right = arr[i + 1];
                if (left > right) {
                    arr[i] = right;
                    arr[i + 1] = left;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
