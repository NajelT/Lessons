package com.tms.conditions;

import java.util.Scanner;

public class conditions2 {
    public static void main(String[] args) {
        //Задание 2
        System.out.println("Введите название месяца из представленных (Июнь,Июль,Август,Сентябрь,Октябрь,Ноябрь),а я определю какая это пора года! (Немыслимо!)");
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        switch (t){
            case "Июль":
                System.out.println("Это месяц жаркого лета, парень!");
                break;
            case "Июнь":
                System.out.println("Это месяц жаркого лета, парень!");
                break;
            case "Август":
                System.out.println("Это месяц жаркого лета, парень!");
                break;

            case "Сентябрь":
                System.out.println("Это месяц сопливой осени, парень!");
                break;
            case "Октябрь":
                System.out.println("Это месяц сопливой осени, парень!");
                break;
            case "Ноябрь":
                System.out.println("Это месяц сопливой осени, парень!");
                break;
            default:
                System.out.println("Что то ты не то ввел, парень");
        }
    }
}
