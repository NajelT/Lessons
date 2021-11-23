package com.tms.lesson4;

public class User {
    public String name;
    public String secondName;
    public int age;
    GENDER gender;

    public User(String name,String secondName,int age,GENDER gender){
        this.name=name;
        this.secondName=secondName;
        this.age=age;
        this.gender=gender;
    }

    public static class Adress {
        private final String country;
        private final String city;

        public Adress(String country, String city) {
            this.country = country;
            this.city = city;
        }
    }

    public void addAdress(){
        Adress adress= new Adress("Belarus", "Novopolotsk");
        System.out.println(adress.country+adress.city);
    }

    public String returnName() {
        return this.name+this.secondName;
    }
    @Deprecated
    public void increaseAge100(){this.age+=100;}

    public void increaseAge1(){
        this.age+=1;
    }

    public void out(){
        System.out.println(this.name+ this.secondName+ this.age+ this.gender);
    }
}
