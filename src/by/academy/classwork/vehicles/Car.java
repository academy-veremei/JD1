/*
 * Lesson 5.2 ООП.Закрепление Задание 7
 *
 * 14.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private int carWeight;

    by.academy.classwork.professions.Driver driver = new Driver("Зубенко М.П.", 20);
    by.academy.classwork.details.Engine engine = new Engine(200, "Nissan");

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println(carBrand + " " + carClass + " " + " " + carWeight);
        System.out.println(driver.getDriverFullName() + " " + driver.getDriverExperience());
        System.out.println(engine.getEnginePower() + " " + engine.getEngineManufacturer());
    }


}
