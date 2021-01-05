/*
5.
	Написать программу которая проверяет, что строка начинается буквой “J”или “N”
	и заканчивается “A”. Используем функциональный интерфейс Predicate.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Predicate<String> jna = (String s) -> (s.charAt(0) == 'J' || s.charAt(0) == 'N') & s.charAt(s.length() - 1) == 'A';

        System.out.println(jna.test("JAVA"));
        System.out.println(jna.test("KOTLIN"));
    }
}
