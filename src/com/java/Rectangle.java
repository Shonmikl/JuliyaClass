package com.java;

import java.util.Scanner;

public class Rectangle {
    // координаты - левый верхний угол
    int leftTopX1;
    int leftTopY1;

    // координаты - правый нижний угол
    int rightBottomX2;
    int rightBottomY2;

    /*
    Для того что бы у нас был конструктор, который принимает ширину и длину
    нам нужно их проинициализировать и вычислить
     */
    int length = rightBottomX2 - leftTopX1;
    int high = leftTopY1 = rightBottomY2;

    // конструктор без аргументов
    public Rectangle() {
    }

    // конструктор принимает длину и ширину
    public Rectangle(int length, int high) {
        this.length = length;
        this.high = high;
    // перемещение левого верхнего угла в [0, 0]
        this.leftTopX1 = 0;
        this.leftTopY1 = 0;
    }

    // конструктор со всеми координатами
    public Rectangle(int leftTopX1, int leftTopY1, int rightBottomX2, int rightBottomY2) {
        this.leftTopX1 = leftTopX1;
        this.leftTopY1 = leftTopY1;
        this.rightBottomX2 = rightBottomX2;
        this.rightBottomY2 = rightBottomY2;
    }

    // вывод всех координат
    public void rectPrint() {
        System.out.println(
                "[X1 : " + leftTopX1 + "]" + "\n"+
                "[X2 : " + rightBottomX2  + "]" + "\n"+
                "[Y1 : " + leftTopY1+ "]" + "\n"+
                "[Y2 : " + rightBottomY2+ "]" + "\n"
        );
    }

    // двигаем фигуру по оси "Х"
    public void move(int dx, int dy) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 'dx':");
        dx = scanner.nextInt();
        leftTopX1 += dx;
        rightBottomX2 +=dx;

        System.out.println("Please type 'dy':");
        dy = scanner.nextInt();
        leftTopY1 +=dy;
        rightBottomY2 +=dy;
    }


    public int calcLength() {
        return 0;
    }

    public int calcHigh() {
        return 0;
    }

    public int calcPer() {
        return 0;
    }

    public int square() {
        return 0;
    }
}