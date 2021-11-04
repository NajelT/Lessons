package com.tms.conditions;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
//Задание 1
        System.out.println("Введите 1 английскую букву из представленных a,o,l,m");
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
 /* //      if (t.equals("a")){
            System.out.println("А буквочка то гласная!");
        } else if (t.equals("o")){
            System.out.println("А буквочка то гласная!");
        }else if (t.equals("l")){
            System.out.println("А буквочка то согласная!");
        }else if (t.equals("m")){
            System.out.println("А буквочка то согласная!");
        }*/
        switch (t){
            case"a":
                System.out.println("А буквочка то гласная!");
                break;
            case"o":
                System.out.println("А буквочка то гласная!");
                break;
            case"l":
                System.out.println("А буквочка то согласная!");
                break;
            case"m":
                System.out.println("А буквочка то согласная!");
                break;
            default:
                System.out.println("Goodbye!");
        }
    }
}
