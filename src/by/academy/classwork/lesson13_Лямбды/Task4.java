/*
4.
	Написать программу проверяющую, что строка не null и не пуста,
	используя метод and() функционального интерфейса Predicate.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        Predicate<String> notNull = t -> t != null;
        Predicate<String> isEmpty = t -> !t.isEmpty();

        String falseS = null;
        String trueS = "test";

        System.out.println(notNull.and(isEmpty).test(falseS));
        System.out.println(notNull.and(isEmpty).test(trueS));
    }
}
