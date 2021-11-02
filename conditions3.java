package com.tms.conditions;

import java.util.Scanner;

public class conditions3 {
    public static void main(String[] args) {

        int x=99;
        int y=1;
        x+=y;
        System.out.println(x);


        System.out.println("Введите то, что нужно ввести! (E**t)");
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        int l = 1;
        while (l == 1) {
            System.out.println("Вы ввели "+t);
            System.out.println("Попробуйте еще раз!");
            String m = scanner.next();
            if (m.equals("Exit")){
                l++;
                System.out.println("Goodbye!");
            }
        }
    }
}