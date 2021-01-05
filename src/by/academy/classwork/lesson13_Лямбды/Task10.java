/*
10.
	Создать программу-калькулятор, в которую мы передаем 2 числа и оператор (+,-,*,/).
	Написать свой функциональный интерфейс для вычисления.
	Использовать лямбды.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.HashMap;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        Map<String, Calculator> catalog = new HashMap<>();

        catalog.put("+", (d, c) -> d + c);
        catalog.put("-", (d, c) -> d - c);
        catalog.put("*", (d, c) -> d * c);
        catalog.put("/", (d, c) -> d / c);

        System.out.println(catalog.get("+").calc(3, 3));
    }
}
