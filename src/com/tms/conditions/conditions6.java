package com.tms.conditions;

import java.util.Arrays;

public class conditions6 {
    public static void main(String[] args) {
        int[] arr = {12345, 2, -47, 62, -77, 820, 69,16};
        for(int j=0;j<arr.length;j++){
            for (int i = 0; i < arr.length -1; i++) {
                int left =arr[i];
                int right= arr[i+1];
                if (left>right){
                    arr[i]=right;
                    arr[i+1]=left;
                }
            }
        }
     System.out.println(Arrays.toString(arr));
    }
}