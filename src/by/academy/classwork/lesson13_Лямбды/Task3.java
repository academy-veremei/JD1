/*
3.
	Создать лямбда выражение, которое проверяет, что строка не пуста,
	используя функциональный интерфейс Predicate.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> predicate = (String s) -> s != null && !s.isEmpty();

        String falseS = null;
        String trueS = "test";

        System.out.println(predicate.test(falseS));
        System.out.println(predicate.test(trueS));
    }
}
