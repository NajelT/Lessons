package com.tms.lesson3;

public class homework2 {
    public static void main(String[] args) {
    int[] arr = {2,32,-67,666,2000,-37,17,1992,987};
    int min=0;
    int max=0;
    for(int i=0;i< arr.length;i++){
        if (arr[i]<min) {
            min=arr[i];
        }
        if (arr[i]>max){
            max=arr[i];
        }
    }
    int sum=min+max;
    System.out.println(min+ ", Вы - самое слабое звено, прощайте :(");
    System.out.println(max+ ", Вы - самое сильное число! Вы будете нашим королем!");
    System.out.println(sum+ " = Сумма минимального и максимального элемента");
    }
}