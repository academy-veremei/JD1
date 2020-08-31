/*
1.
	Написать лямбда выражение для интерфейса Printable,
	который содержит один метод void print().
 */
package by.academy.classwork.lesson13_Лямбды;


public class Task1 {
    public static void main(String... args) {
        Printable printable = (String s) -> System.out.println();

        printable.print("Hello!");
    }
}
