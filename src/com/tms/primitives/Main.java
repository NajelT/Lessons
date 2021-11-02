package com.tms.primitives;

public class Main {
    public static void main(String[] args) {
        //1ЗАДАНИЕ
        int value5 = 8;
        int value9 = 3;
        int sum1 = value5 / value9;
        int sum2 = value5 % value9;
        if (sum2 != 0) {
            System.out.println(sum1 + " Целых");
            System.out.println(sum2 + " Остаток");
        } else System.out.println(sum1 + " Целых");
        //2ЗАДАНИЕ
        System.out.println("----------------------");
        int x = 2345;
        int y, z, a;
        if (x > 1000) {
            y = (x / 1000);
            z = (x-(y*1000))/100;
            a = (x-(y*1000)-(z*100))/10;
            System.out.println(y + " тысяч "+z + " сотен " +a+ " десятков");}
        else if (x > 100) {
            z = (x/100);
            a = (x-(z*100))/10;
            System.out.println(z + " сотен "+ a + " десятков");
        } else if (x < 100) {
            a = x / 10;
            System.out.println(a + " десятков");}
        System.out.println("Goodbye!");
    }
}
