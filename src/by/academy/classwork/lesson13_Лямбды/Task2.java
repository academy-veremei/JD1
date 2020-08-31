/*
2.
	Создать лямбда выражение, которое возвращает значение true,
	если строка не null, используя функциональный интерфейс Predicate.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer i) -> i != null;

        Integer falseI = null;
        Integer trueI = 1;

        System.out.println(predicate.test(falseI));
        System.out.println(predicate.test(trueI));
    }
}
