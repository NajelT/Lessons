package com.tms.conditions;

public class conditions5 {
    public static void main(String[] args) {
        int[] arr = {2, 108, -33, 7, 7000};
        int minval = 0;
        int maxval = 0;
        for (int i : arr) {
            if (i < minval)  {
                minval = i;
            }
            if (i > maxval) {
                maxval = i;
            }
        }
        System.out.println("Минимальная величина массива "+minval);
        System.out.println("Максимальная величина массива "+maxval);
    }
}