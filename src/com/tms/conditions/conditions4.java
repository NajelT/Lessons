package com.tms.conditions;

import java.util.Scanner;

public class conditions4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a= scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum=0;
        int min=0;
        int max=0;

        if(a>b){
            max=a;
            min=b;
        }else if (b>a){
            max=b;
            min=a;
        }

        if ((max==min)||(max-min==1)) {
            System.out.println("Между ними нет чисел");
        }
        for (min=min+1;min<max;min++){
            if(min%3==0){
                sum+=min;
            }
        }
        System.out.println("Сумма всех чисел, которые делятся на 3, между двумя введенными числами  = "+ sum);
    }
}