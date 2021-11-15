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

    public static class adress {
        private final String country;
        private final String city;

        public adress(String country, String city) {
            this.country = country;
            this.city = city;
        }
    }

    public void addAdress(){
        adress adress= new adress("Belarus", "Novopolotsk");
        System.out.println(adress.country+adress.city);
    }

    public String ReturnName() {
        this.name="Alex";
        this.secondName="Scream";
        String s=this.name+this.secondName;
        return s;
    }



    @Deprecated
    public void IncreaseAge100(){this.age+=100;}

    public void IncreaseAge1(){
        this.age+=1;
    }

    public void Out(){
        System.out.println(this.name+ this.secondName+ this.age+ this.gender);
        addAdress();
    }
}
