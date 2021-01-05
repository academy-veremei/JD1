/*
 * Homework 1 Операторы. Циклы.
 * Задание 3
 *
 * 05.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        number = scanner.nextInt();
        scanner.close();
        if (number > 0 && number < 11) {
            multipleTable(number);
        } else {
            System.out.println("Введенное число вне диапазона [1;10]");
        }

    }

    public static void multipleTable(int number) {
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
