package com.tms.lesson5;

public abstract class Employee extends Person{
    public POST post;

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getInfo(){
        getNameSecondName();
        int salary=getSalary();
        return ("Опыт - "+ this.getExperienceYears()+" (Years). Зарплата - "+ salary +"$" );
    }

    private int experienceYears;

    public Employee(String name, String secondName,int experienceYears) {
        super(name, secondName);
        this.experienceYears=experienceYears;
    }

    public abstract int getSalary();

    public abstract void outPost();
}
