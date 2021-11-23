package com.tms.conditions;

import java.util.Scanner;

public class conditions3 {
    public static void main(String[] args) {
        System.out.println("Введите то, что нужно ввести! (E**t)");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String t = scanner.next();
            if (t.equals("Exit")) {
                break;
            }
            System.out.println("Вы ввели "+t +", попробуйте еще раз!");}
        System.out.println("Goodbye!");
    }
}