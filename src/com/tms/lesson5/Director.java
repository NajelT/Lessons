package com.tms.lesson5;

import java.util.Arrays;

public class Director extends Employee implements Finder {

    private Employee [] employees=null;

    @Override
    public void post() {
        post = POST.DIRECTOR;
        System.out.println("Занимаемая должность - "+ post);
    }

    public Director(String name, String secondName, int experienceYears) {
        super(name, secondName, experienceYears);
    }


    public void addWorker(Employee employee) {
        if(employees==null){
            employees=new Employee[1];
            employees[0]=employee;
        }else{
            employees=Arrays.copyOf(employees,employees.length+1);
            employees[employees.length-1]=employee;
        }
        }

    @Override
    public int Salary() {
        post();
        int salary;
        salary = 1000 * post.getCoef() * getExperienceYears()*(employees.length+1);
        return salary;
    }

    @Override
    public String getInfo() {
        getName();
        return ("Опыт - "+ this.getExperienceYears()+" (Years). Зарплата - "+Salary() +"$" );
    }
    public void getSubordinatesInfo(){
        System.out.println("Под управлением работники :");
        for (Employee employee : employees) {
            System.out.println(employee.getInfo());
        }
    }

    @Override
    public void find(Director director, String workerName) {
        for(int i=0;i<employees.length;i++){
            if ((employees[i].GetName()).equals(workerName)){
                System.out.println("Мы нашли "+workerName +" ! Этот сотрудник находится в подчинении у "+director.GetName()+".");
            }
        }
    }
}