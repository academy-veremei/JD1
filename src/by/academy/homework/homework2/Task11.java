/*
 * Homework 2 Deal.RegExp.Строки.
 * Задание 11
 *
 * Условие задачи: ввести 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого
 * слова и второй половины второго слова.
 *
 * 24.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework2;

import java.util.Scanner;

public class Task11 {

    public static void main(String... strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два слова с четным числом букв");

        StringBuilder firstWord = new StringBuilder(scanner.nextLine());
        StringBuilder secondWord = new StringBuilder(scanner.nextLine());

        firstWord.delete(firstWord.length() / 2, firstWord.length());
        secondWord.delete(0, secondWord.length() / 2);

        if (firstWord.length() % secondWord.length() == 0) {
            System.out.println(firstWord.append(secondWord));
        } else {
            System.out.println("Оба слова должны быть с четным числом букв");
        }
    }
}
