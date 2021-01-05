/*
9.
    Переделать класс использующий Printable используя ссылку на статический метод.
 */
package by.academy.classwork.lesson13_Лямбды;

public class Task9 {
    public static void main(String[] args) {
        Printable hello = System.out::println;

        hello.print("Hello!");
    }
}
