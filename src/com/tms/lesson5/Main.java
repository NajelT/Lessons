package com.tms.lesson5;

public class Main{
    public static void main(String[] args) {
        Director director1 = new Director("Jacky", "Reaper", 2);
        Director director2 = new Director("Joseph", "Clay", 2);

        Worker worker1 = new Worker("Alex", "Scream", 2);
        Worker worker2 = new Worker("Anna", "Ruma", 4);
        Worker worker3 = new Worker("Roman", "Bubar", 0);

        director1.addWorker(worker1);
        director1.addWorker(worker2);

        director2.addWorker(worker3);
        director1.addWorker(director2);

        String s = director1.getInfo();
        System.out.println(s);

        director1.getSubordinatesInfo();

        Finder finder1 = new SimpleFinder();
        finder1.find(director1, "Anna");

        Finder finder2 = new DeepFinder();
        finder2.find(director1,"Roman");
    }
}
