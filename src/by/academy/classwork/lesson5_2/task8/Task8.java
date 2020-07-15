/*
 * Lesson 5.2 ООП.Закрепление Задание 8
 *
 * 14.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson5_2.task8;

public class Task8 {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Dog dog = new Dog("Мясо", "Будка");
        Cat cat = new Cat("Молоко", "Дом");
        Horse horse = new Horse("Сено", "Стойло");
        Animal[] animals = new Animal[]{dog, cat, horse};

        for (int i = 0; i < animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}
