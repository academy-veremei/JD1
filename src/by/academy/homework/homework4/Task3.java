/*
 * Homework 4 Коллекции.Исключения.
 * Задание 3
 *
 * Имеется текст. Следует составить для него частотный словарь: Создать Map<Character, Integer> для символов,
 * в который мы заносим символ и его количество.
 *
 * 14.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework4;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String text = "Переносной радиоприёмник 2 класса Океан-209 с 1976 года выпускало Минское ПТО Горизонт " +
                "Приёмник создан на базе модели Океан-205 и отличается от неё улучшенными параметрами и внешним " +
                "оформлением. В приёмнике имеется ряд оригинальных схемных решений. Приёмник работает в диапазонах " +
                "ДВ, СВ, КВ 5 поддиапазонов и УКВ. В диапазоне УКВ подстройка частоты автоматическая. " +
                "Приёмник имеет: раздельные регуляторы тембра по ВЧ и НЧ; стрелочный индикатор настройки; подсветку шкалы.";

        Map<Character, Integer> frequencyDictionary = new HashMap<>();
        char[] charText = text.toCharArray();

        for (char c : charText) {
            if (frequencyDictionary.containsKey(c)) {
                int count = frequencyDictionary.get(c);
                frequencyDictionary.put(c, ++count);
            } else {
                frequencyDictionary.put(c, 1);
            }
        }
        System.out.println(frequencyDictionary);
    }
}
