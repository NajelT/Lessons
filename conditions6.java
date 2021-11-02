package com.tms.conditions;

import java.util.Arrays;

public class conditions6 {
    public static void main(String[] args) {
        int arr[] = {12345, 2, -47, 62, 77};
        for(int j=0;j<arr.length;j++){
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int el =arr[i];
            if (el>arr[i+1]){
                int left=el;
                int right= arr[i+1];
                arr[i]=right;
                arr[i+1]=left;
            }}
            //System.out.println(arr[i]);
        }//Сделал хотя бы таким способом.

/*        for (int i=0;i<arr.length;i++) {
            int min = arr[i];
            int min_i = i;
            for (int j=i+1;j<arr.length;j++) {
            if (j<min){
                min = arr[j];
                min_i=j;
            }
            }
            if (i!=min_i){
                int tmp=arr[i];
                arr[i]=arr[min_i];
                arr[min_i]=tmp;
            }
        }*/
        System.out.println(Arrays.toString(arr));}
}