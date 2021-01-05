/*
 * Lesson 5_2 ООП.Закрепление Задание 1
 *
 * 14.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson5_2.task1;

public class Task1 {
    public static void main(String[] args) {
        Phone apple = new Phone(2020327, "Apple", 50.0);
        Phone nokia = new Phone(2020326, "Nokia", 60);
        Phone lg = new Phone(2020325, "LG", 55);

        System.out.println(apple.getNumber() + " " + apple.getModel() + " " + apple.getWeight());
        System.out.println(nokia.getNumber() + " " + nokia.getModel() + " " + nokia.getWeight());
        System.out.println(lg.getNumber() + " " + lg.getModel() + " " + lg.getWeight());
        System.out.println();

        apple.receiveCall("Виктор");
        System.out.println(apple.getNumber());
        System.out.println();

        nokia.receiveCall("Игорь");
        System.out.println(nokia.getNumber());
        System.out.println();

        lg.receiveCall("Елена");
        System.out.println(lg.getNumber());
        System.out.println();

        lg.setPhone(2030327, 65.3);
        apple.receiveCall("Виктор " + apple.getNumber());
        apple.sendMessage(111111111, 222222222, 333333333, 333333333);
    }

}
