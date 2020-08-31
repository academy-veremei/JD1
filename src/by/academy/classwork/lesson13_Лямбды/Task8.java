/*
8.
    Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
    Используем функциональный интерфейс Supplier.
 */
package by.academy.classwork.lesson13_Лямбды;

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(10);

        System.out.println(random.get());
    }
}
