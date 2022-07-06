package com.java.rectangle.exceptionsTask;

import java.util.*;

public class Task1 {

    private final static int ZERO = 0; // 0 < a < b
    private final static int RANGE_B = 1000;
    private static int rangeA;
    private static final int[] array = new int[4]; //0 1 2 3


    public int[] putToArray() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("We have a range from " + ZERO + " to " + RANGE_B);

        int count = 0;
        while (count < array.length) {
            System.out.println("Please enter a digit in this range:");
            System.out.println(array.length - count + ": numbers left");

            try {
                rangeA = SCANNER.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You have to put only digit" +
                        "in range from 0 to " + RANGE_B + "!!!");
            }

            if(0 < rangeA && rangeA < RANGE_B) {
                array[count] = rangeA;
                count++;
            } else throw new IndexOutOfBoundsException();
        }
        System.out.println("The array was filled");
        SCANNER.close();

        return array;
    }

    public int[] getMinAndMax(int[] array) {
        Arrays.sort(array);
        return new int[] {array[0], array[array.length-1]};
    }
}