package com.tms.lesson3;

import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) { //Числа Фибоначчи
        int[] arr = new int[15];
        arr[0]=1;
        arr[1]=1;
        for (int a=2; a<arr.length;a++) {
            arr[a]=arr[a-1]+arr[a-2];}
        System.out.println(Arrays.toString(arr));
    }
}