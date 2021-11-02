package com.tms.conditions;

public class conditions5 {
    public static void main(String[] args) {
        int[] arr = {2, 108, -33, 7, 33};
        int minval = 0;
        int maxval = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
            }
            for (int l = 0; l < arr.length; l++) {
                if (arr[l] > maxval) {
                    maxval = arr[l];
                }
            }
        }
        System.out.println("Минимальная величина массива "+minval);
        System.out.println("Максимальная величина массива "+maxval);
    }
}