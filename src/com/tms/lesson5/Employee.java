package com.tms.lesson5;

public abstract class Employee extends Person{
    public POST post;

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getInfo(){
        getName();
        return ("Опыт - "+ this.getExperienceYears()+" (Years). Зарплата - "+Salary() +"$" );
    }

    private final int experienceYears;


    public Employee(String name, String secondName,int experienceYears) {
        super(name, secondName);
        this.experienceYears=experienceYears;
    }

    public abstract int Salary();

    public abstract void post();
}
