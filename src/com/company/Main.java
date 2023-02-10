package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ю сторону треугольника");
        int firstSide = scanner.nextInt();
        System.out.println("Введите 2-ю сторону треугольника");
        int secondSide = scanner.nextInt();
        System.out.println("Введите 3-ю сторону треугольника");
        int thirdSide = scanner.nextInt();
        if (firstSide + secondSide < thirdSide || firstSide + thirdSide < secondSide || secondSide + thirdSide < firstSide) {
            System.out.println("Такой треугольник не существует");
        } else System.out.println("Треугольник существует");

        if (firstSide == secondSide && firstSide == thirdSide && secondSide == thirdSide) {
            System.out.println("Треугольник равносторонний");
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            System.out.println("Треугольник равнобедренный");
        } else System.out.println("Треугольник разносторонний");

        System.out.println("Введите 1-й угол треугольника");
        int firstAngle = scanner.nextInt();
        System.out.println("Введите 2-й угол треугольника");
        int secondAngle = scanner.nextInt();
        System.out.println("Введите 3-й угол треугольника");
        int thirdAngle = scanner.nextInt();
        if (firstAngle + secondAngle + thirdAngle != 180) {
            System.out.println("Это не треугольник");
        } else System.out.println("Это треугольник");
    }
}