/*
 * Homework 1 Операторы. Циклы.
 * Задание 4
 *
 * 05.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework1;
import java.lang.Math;

public class Task4 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1;result < 1000000;i++){
            result = (int)Math.pow(2,i);
            System.out.println(i);
        }
    }
}
