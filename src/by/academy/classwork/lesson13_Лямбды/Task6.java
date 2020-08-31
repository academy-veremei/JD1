/*
6.
	Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и
	выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с весом n”
	Используем функциональный интерфейс Consumer и метод по умолчанию andThen.
 */
package by.academy.classwork.lesson13_Лямбды;

import by.academy.classwork.lesson_03_08.HeavyBox;

import java.util.function.Consumer;

public class Task6 {
    public static void main(String[] args) {
        Consumer<HeavyBox> receive = T -> System.out.println("Отгрузили ящик с весом " + T.getWeight());
        Consumer<HeavyBox> send = T -> System.out.println("Отправляем ящик с весом " + T.getWeight());

        HeavyBox box = new HeavyBox(12);

        receive.accept(box);
        send.accept(box);
    }
}
