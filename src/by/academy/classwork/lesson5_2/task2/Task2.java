/*
 * Lesson 5.2 ООП.Закрепление Задание 2
 *
 * 14.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson5_2.task2;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.fullName = "Person";
        Person person2 = new Person("Person2", 26);

        person.move();
        person.talk();

        person2.move();
        person2.talk();
    }
}
