package com.tms.lesson5;

public class Person{
    private final String name;
    private final String secondName;

    public Person(String name, String secondName){
        this.name=name;
        this.secondName=secondName;
    }
    public void getName(){
        System.out.println(name + " " + secondName);
    }

    public String GetName(){
        return name;
    }
}
