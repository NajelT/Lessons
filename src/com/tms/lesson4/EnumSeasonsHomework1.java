package com.tms.lesson4;

public class EnumSeasonsHomework1 {
    public static void main(String[] args) {

        EnumMonth month = EnumMonth.SEPTEMBER;
        switch (month)
        {
            case JUNE:
                System.out.println(EnumSeasons.SUMMER);
                break;
            case JULY:
                System.out.println(EnumSeasons.SUMMER);
                break;
            case AUGUST:
                System.out.println(EnumSeasons.SUMMER);
                break;

            case SEPTEMBER:
                System.out.println(EnumSeasons.AUTUMN);
                break;
            case OCTOBER:
                System.out.println(EnumSeasons.AUTUMN);
                break;
            case NOVEMBER:
                System.out.println(EnumSeasons.AUTUMN);
                break;
        }
    }
}
