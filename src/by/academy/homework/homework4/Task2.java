/*
 * Homework 4 Коллекции.Исключения.
 * Задание 2
 *
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 *
 * 14.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework4;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        int temp;
        int max = 0;
        String element;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ученик1");
        arrayList.add("7");
        arrayList.add("Ученик2");
        arrayList.add(null);
        arrayList.add("Ученик3");
        arrayList.add("9");
        arrayList.add("Ученик4");
        arrayList.add("6");

        IteratorTask2<String> iterator = new IteratorTask2<>(arrayList);

        while (iterator.hasNext()) {
            element = iterator.next();

            if (element.matches("\\d")) {
                temp = Integer.parseInt(element);

                if (temp > max) {
                    max = temp;
                }

            }

        }
        System.out.println(max);
    }

}
