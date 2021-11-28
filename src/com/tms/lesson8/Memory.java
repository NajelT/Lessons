package com.tms.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Memory {

    public String[] memory = null;

    public void outElements() throws NullException {
        try {
            if (memory == null) {
                throw new NullException();
            } else {
                for (int i = 0; i < memory.length; i++) {
                    System.out.println(Arrays.toString(memory));
                }
            }
        } catch (NullException exc) {
            System.out.println("Found NullException!");
        }
    }

    public void deleteLastEl() {
        try {
            if (memory == null) {
                throw new NullException();
            } else {
                memory = Arrays.copyOf(memory, memory.length - 1);
            }
        } catch (NullException exc3) {
            System.out.println("NullException found!");
        }
    }

    public void addEl() throws RefillException {
        System.out.println("Введите первый элемент");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (memory == null) {
            memory = new String[1];
            memory[0] = input;
            System.out.println(Arrays.toString(memory));
            while (memory.length < 6) {
                System.out.println("Вводи еще");
                input = scanner.next();
                if (input.equals("Exit")) {
                    break;
                }
                if (input.equals("get")) {
                    memory = Arrays.copyOf(memory, memory.length - 1);
                    System.out.println(Arrays.toString(memory));
                } else {
                    memory = Arrays.copyOf(memory, memory.length + 1);
                    memory[memory.length - 1] = input;
                    System.out.println(Arrays.toString(memory));
                    try {
                        if (memory.length == 5) {
                            throw new RefillException();
                        }
                    } catch (RefillException exc2) {
                        System.out.println("Внимание! Массив почти переполнен! Введите 'get' для удаления последнего элемента!");
                    }
                }
            }
        }
    }
}