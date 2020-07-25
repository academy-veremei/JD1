/*
 * Homework 2 Deal.RegExp.Строки.
 * Задание 3
 *
 * Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
 * a) dd/MM/yyyy
 * b) dd-MM-yyyy
 *
 * 23.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task3 {
    public static Pattern patternA = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}");
    public static Pattern patternB = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd/MM/yyyy или dd-MM-yyyy");

        String date = scanner.nextLine();

        Matcher matcherA = patternA.matcher(date);
        Matcher matcherB = patternB.matcher(date);

        if (matcherA.find()) {
            System.out.println("Введенная дата " + matcherA.group(0) + " соответтвует формату dd/MM/yyyy");
        } else if (matcherB.find()) {
            System.out.println("Введенная дата " + matcherB.group(0) + " соответтвует формату dd-MM-yyyy");
        } else {
            System.out.println("Введенная строка не соответствует ни одному из форматов");
        }
    }
}