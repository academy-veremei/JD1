/*
 * Homework 4 Коллекции.Исключения.
 * Задание 1
 *
 * Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>) Протестировать в main.
 *
 * 14.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework4;

import by.academy.homework.homework4.universal_iterator.MyUniversalIterator;
import by.academy.homework.homework4.universal_iterator.TwoArrayIterator;

public class Task1 {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2, null, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        MyUniversalIterator<Integer> iterator = new TwoArrayIterator<>(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
