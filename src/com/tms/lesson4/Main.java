package com.tms.lesson4;

import static com.tms.lesson4.GENDER.FEMALE;
import static com.tms.lesson4.GENDER.MALE;

public class Main {
    public static void main(String[] args) {

        int[] m = {22,46,89,100,-50};
        Massive massive1=new Massive(m);
        massive1.MassMaxEl(m);
        massive1.MassSort(m);

        User user1=new User("Evgeny","Filipenko",29,MALE);
        User user2=new User("Anna","Ruma",32,FEMALE);
        User user3=new User("mnmn","dsds1234",1,MALE);

        user2.IncreaseAge1();
        user3.IncreaseAge100();
        String user4=user3.ReturnName();



        user1.Out();
        System.out.println(user2.name+user2.secondName+user2.age);
        System.out.println(user4);
        System.out.println(user3.age);
    }
}
