/*
 * Homework 4 Коллекции.Исключения.
 * Задание 4
 *
 * Создать свое исключение CustomException.
 * Попробовать добавить в массив int на 8 элементов 10 чисел.
 * Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
 * "Array is to small, expand the array". После чего выкинуть свое исключение CustomException.
 *
 * 14.08.2020
 *
 * Дмитрий Веремей
 */
package by.academy.homework.homework4;

public class Task4 {
    public static void main(String[] args) throws CustomException {
        int[] testArray = new int[8];

        try {
            for (int i = 0; i != 10; i++) {
                testArray[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is to small, expand the array");
            throw new CustomException("Федя, шпингалеты лопнули!");
        }
    }

}
