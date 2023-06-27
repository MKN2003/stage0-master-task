package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int product = 0;
        for (int i = 1; i <= 10; i++) {
            product = numberTableToPrint * i;
            System.out.println(i + " x " + numberTableToPrint + " = " + product);
        }
    }
}

