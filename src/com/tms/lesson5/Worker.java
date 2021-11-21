package com.tms.lesson5;

public class Worker extends Employee{

    @Override
    public void post() {
        post=POST.WORKER;
        System.out.println("Занимаемая должность - "+post);
    }

    public Worker(String name, String secondName, int experienceYears) {
        super(name, secondName, experienceYears);
    }

    @Override
    public int Salary() {
        post();
        int salary;
        if(getExperienceYears()==0){
            salary =1000;
        } else {
            salary = 1000 * post.getCoef() * getExperienceYears();
        }
        return salary;
    }
}
