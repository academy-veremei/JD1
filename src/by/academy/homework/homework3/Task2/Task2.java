/*
 * Homework 3 Внутренние классы.Дженерики.
 * Задание 2
 *
 * Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
 * Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
 * Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
 * Содержит методы:
 * 1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен,
 * нам нужно его расширить с помощью Arrays.copyOf)
 * 2) взятие по индексу get(int i)
 * 3) взятие последнего элемента getLast()
 * 4) взятие первого элемента getFirst()
 * 5) вывод размера массива
 * 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
 * 7) удаление элемента по индексу (remove(int i)
 * 8) удаление элемента по значению (remove(T obj))
 *
 * 04.08.2020
 *
 * Дмитрий Веремей
 */

package by.academy.homework.homework3.Task2;

public class Task2 {
    public static void main(String[] args) {
        AnyType<Integer> box = new AnyType<>(10);

        box.addToBox(1);
        box.addToBox(2);
        box.addToBox(3);
        box.addToBox(4);
        box.addToBox(5);
        box.addToBox(6);
        box.addToBox(7);
        box.addToBox(8);
        box.addToBox(9);

        System.out.println(box.getFromBoxByIndex(2));

        System.out.println(box.getLast());

        System.out.println(box.getFirst());

        box.printBoxSize();

        box.printIndexOfLastFilledElement();

        box.deleteFromBoxByIndex(6);

        box.deleteFromBoxByValue(9);
    }

}
