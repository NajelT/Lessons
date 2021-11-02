package com.tms.conditions;

import java.util.Scanner;

public class conditions4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
       int a= scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum;//Обьявил переменные

        if ((a==b)||(a-b==1)||(a-b==-1)){
            System.out.println("Между ними нет чисел");}//допустим пользователь введет 7 и 7 или 7 и 8 - между ними нету чисел. Грустно конечно, но как есть - есть :(

        if (a>b){//Считаем сумму чисел, которые делятся на 3, если введенное пользователем первое число оказалось больше второго числа .
            for(sum=0;(a>b);b++) {
                if (b%3==0) {
                    sum = sum + b; }}
        System.out.println("Сумма всех чисел, которые делятся на 3, между двумя введенными числами  = "+ sum);}
        if (b>a){//Считаем сумму чисел, которые делятся на 3, если введенное пользователем второе число оказалось больше первого числа .
            for(sum=0;(b>a);a++) {
                if (a%3==0) {
                    sum = sum + a; }}
        System.out.println("Сумма всех чисел, которые делятся на 3, между двумя введенными числами  = "+ sum);}
    }
}