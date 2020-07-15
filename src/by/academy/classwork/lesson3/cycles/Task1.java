/*
 * Lesson 3 Циклы Задание 1
 *
 * 01.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson3.cycles;

import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 10;i < 21;i++){
            int number = (int)Math.pow(i,2);
            System.out.println(number);
        }
    }
}
