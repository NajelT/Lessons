package com.tms.lesson5;

public class SimpleFinder implements Finder{

    @Override
    public void find(Director director, String workerName) {
        for(int i=0;i<director.getEmployees().length;i++){
            if ((director.getEmployees()[i].getName()).equals(workerName)) {
                System.out.println("Мы нашли " + workerName + " ! Этот сотрудник находится в подчинении у " + director.getName() + ".");
            }
        }
    }
}