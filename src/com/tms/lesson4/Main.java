package com.tms.lesson4;
import static com.tms.lesson4.GENDER.FEMALE;
import static com.tms.lesson4.GENDER.MALE;
public class Main {
    public static void main(String[] args) {
        int[] m = {22,46,89,100,-50};
        Massive massive1=new Massive(m);
        massive1.massMaxElFind(m);
        massive1.massSort(m);
        User user1=new User("Evgeny","Filipenko",29,MALE);
        User user2=new User("Anna","Ruma",32,FEMALE);
        User user3=new User("Alex","Scream",1,MALE);
        user2.increaseAge1();
        user3.increaseAge100();
        String user4=user3.returnName();
        System.out.println(user4);
        user1.addAdress();
        user1.out();
        user2.out();
        user3.out();
    }
}