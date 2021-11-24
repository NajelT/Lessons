package com.tms.lesson5;

public class DeepFinder implements Finder {

    @Override
    public void find(Director director, String workerName) {
        for (Employee employee : director.getEmployees()) {
            if (employee instanceof Director) {
                find((Director) employee, workerName);
                return;
            } else if ((employee.getName()).equals(workerName)) {
                System.out.println("Мы нашли " + workerName + " ! Этот сотрудник находится в подчинении у " + director.getName() + ".");
                return;
            }
        }
    }
}