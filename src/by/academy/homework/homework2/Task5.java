/*
 * Homework 2 Deal.RegExp.Строки.
 * Задание 5
 *
 * Создать интерфейс Validator, с методом validate, принимающим строку, возвращая true/false.
 * Написать класс AmericanPhoneValidator, который валидирует американский телефон(начинающийся на +1...)
 * Написать класс BelarusPhoneValidator, который валидирует белорусский телефон(начинающийся на +375...)
 * Написать класс EmailValidator в методе main, валидирующий email.
 * Все три класса должны реализовать интерфейс Validator.
 *
 * 23.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Validator emailValidator = new EmailValidator();

        Validator belarusianPhoneValidator = new BelarusPhoneValidator();

        Validator americanPhoneValidator = new AmericanPhoneValidator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите американский или белорусский номер телефона:");

        String phoneNumber = scanner.nextLine();

        if (americanPhoneValidator.validate(phoneNumber)) {
            System.out.println("Введен американский номер");
        } else if (belarusianPhoneValidator.validate(phoneNumber)) {
            System.out.println("Введен белорусский номер");
        } else {
            System.out.println("Введен номер неизвестного формата");
        }

        System.out.println("Введите корректный email:");

        String email = scanner.nextLine();
        scanner.close();

        if (emailValidator.validate(email)) {
            System.out.println("Email введен правильно");
        } else {
            System.out.println("Email введен некорректно");
        }
    }

}
