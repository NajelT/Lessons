package com.tms.lesson3;

import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) { //Числа Фибоначчи
        int[] arr = new int[15];
        for (int a=0; a<arr.length;a++) {
            if (a<2){
                arr[a]=1;
            } else arr[a]=arr[a-1]+arr[a-2];}
        System.out.println(Arrays.toString(arr));
    }
}