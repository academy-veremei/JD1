/*
 * Homework 3 Внутренние классы.Дженерики.
 * Задание 1
 *
 * Создать класс MyCustomDate, используя вложенные классы Год, Месяц, День.
 * Методы: задать дату, вывести на консоль день недели по заданной дате.
 * День недели представить в виде перечисления.
 * Рассчитать количество дней, в заданном временном промежутке.
 * Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки.
 * После валидации в конструкторе создаем объекты класса Year, Month, Day.
 * Добавить метод, который проверяет высокосный ли год или нет.
 *
 * 04.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework3.Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        MyCustomDate myCustomDate = new MyCustomDate(inputDate());
        System.out.println(myCustomDate.dayOfWeek() + ", " + myCustomDate.isLeapYear());

        MyCustomDate myAnotherCustomDate = new MyCustomDate(inputDate());

        System.out.println("Дней между датами: " + MyCustomDate.daysBetween(myCustomDate.getDate()
                , myAnotherCustomDate.getDate()));
    }

    public static String inputDate() {
        Scanner scanner = new Scanner(System.in);
        String date;
        do {
            System.out.println("Введите дату в формате dd-mm-yyyy");
            date = scanner.nextLine();
        } while (!validateDate(date));
        return date;
    }

    public static boolean validateDate(String date) {
        Pattern patternDate = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");
        Matcher matcherDate = patternDate.matcher(date);
        return matcherDate.find();
    }

}

