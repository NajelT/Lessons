package com.tms.lesson4;

public class EnumSeasonsHomework1 {
    public static void main(String[] args) {

        ENUMMONTH month = ENUMMONTH.SEPTEMBER;
        switch (month)
        {
            case JUNE: case JULY: case AUGUST:
                System.out.println(ENUMSEASONS.SUMMER);
                break;
            case SEPTEMBER: case OCTOBER: case NOVEMBER:
                System.out.println(ENUMSEASONS.AUTUMN);
                break;
        }
    }
}
