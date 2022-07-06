package com.java.rectangle.exceptionsTask;

import java.util.Arrays;

public class Task1Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int [] result = task1.putToArray();
        //System.out.println(Arrays.toString(result));
        System.out.println
                (Arrays.toString
                        (task1.getMinAndMax
                                (result)));
    }
}