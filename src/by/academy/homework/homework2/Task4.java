/*
 * Homework 2 Deal.RegExp.Строки.
 * Задание 4
 *
 * С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
 * Вывести строку в следующем формате:
 * День: <Day>
 * Месяц: <Month>
 * Year: <Year>
 *
 *
 * 24.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) throws ParseException {
        Pattern patternA = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}");
        Pattern patternB = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");
        SimpleDateFormat dateFormatA = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatB = new SimpleDateFormat("dd-MM-yyyy");

        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        String[] dateIn = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите дату");
            dateIn[i] = scanner.nextLine();
        }

        for (String s : dateIn) {
            Matcher matcherA = patternA.matcher(s);
            Matcher matcherB = patternB.matcher(s);
            if (matcherA.find()) {
                Date date = dateFormatA.parse(s);
                calendar.setTime(date);
                print(calendar);
            } else if (matcherB.find()) {
                Date date = dateFormatB.parse(s);
                calendar.setTime(date);
                print(calendar);
            } else {
                System.out.println("Введенны даты неизвестного формата");
            }
        }
    }

    private static void print(Calendar calendar) {
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println();
    }
}
