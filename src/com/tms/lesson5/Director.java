package com.tms.lesson5;

import java.util.Arrays;

public class Director extends Employee {

    public Employee[] getEmployees() {
        return employees;
    }

    private Employee [] employees=null;

    @Override
    public void outPost() {
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
    public int getSalary() {
        int salary;
        salary = 1000 * POST.DIRECTOR.getCoef() * getExperienceYears()*(employees.length+1);
        return salary;
    }

    @Override
    public String getInfo() {
        getNameSecondName();
        outPost();
        return ("Опыт - "+ this.getExperienceYears()+" (Years). Зарплата - "+ getSalary() +"$" );
    }

    public void getSubordinatesInfo(){
        System.out.println("Под управлением работники :");
        for (Employee employee : employees) {
            System.out.println(employee.getInfo());
        }
    }
}