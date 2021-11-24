package com.tms.lesson5;

public class Worker extends Employee{

    @Override
    public void outPost() {
        post=POST.WORKER;
        System.out.println("Занимаемая должность - "+post);
    }

    public Worker(String name, String secondName, int experienceYears) {
        super(name, secondName, experienceYears);
    }

    @Override
    public int getSalary() {
        return getExperienceYears()==0?1000:1000 * POST.WORKER.getCoef() * getExperienceYears();
    }
}