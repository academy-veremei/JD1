/*
7.
    Написать лямбда выражение, которое принимает на вход число и возвращает значение
    “Положительное число”, “Отрицательное число” или  “Ноль”.
    Используем функциональный интерфейс Function.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.function.Function;

public class Task7 {
    public static void main(String[] args) {
        Function<Integer, String> number = T -> {

            if (T == 0) {
                return "Ноль";
            } else if (T > 0) {
                return "Положительное число";
            }

            return "Отрицательное число";
        };

        System.out.println(number.apply(5));
        System.out.println(number.apply(-1));
        System.out.println(number.apply(0));
    }
}
