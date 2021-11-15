package com.tms.lesson4;

import java.util.Arrays;

public class Massive {

    public int[] massive;

    public Massive(int[] massive){
        this.massive=massive;
    }

    public void MassMaxEl(int[] arr){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public void  MassSort(int[] arr) {
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
