package by.academy.homework.homework7;

import by.academy.classwork.lesson_03_08.HeavyBox;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Ship extends Thread {
    private Port port;
    private final int shipMaxContainersCount = 100;

    private boolean isFull;
    private boolean isEmpty;

    private ArrayList<HeavyBox> shipHold;
    private Semaphore semaphore;

    public Ship(Port port, Semaphore semaphore) {
        super();
        this.port = port;
        shipHold = new ArrayList<>();
        this.semaphore = semaphore;

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            shipHold.add(new HeavyBox(random.nextInt(5000)));
            shipHold.add(new HeavyBox(random.nextInt(5000)));
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ищет свободный порт");

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int controlNum = -1;

        synchronized (port.getDocks()) {
            for (int i = 0; i < 3; i++)
                if (port.getDocks()[i]) {
                    port.getDocks()[i] = false;
                    controlNum = i;
                    System.out.println(Thread.currentThread().getName() + " зашел в порт " + (i + 1) + " контейнеров в трюме: " + shipHold.size());
                    break;
                }
        }

        while (!isEmpty) {
            port.getWarehouse().addToWarehouse(getFromHold());
        }
        System.out.println(Thread.currentThread().getName() + " разгружен, контейнеров в трюме: " + shipHold.size());

        while (!isFull) {
            addToHold(port.getWarehouse().getFromWarehouse());
        }
        System.out.println(Thread.currentThread().getName() + " загружен, контейнеров в трюме: " + shipHold.size());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (port.getDocks()) {
            port.getDocks()[controlNum] = true;
        }

        System.out.println(Thread.currentThread().getName() + " вышел из порта");
        System.out.println("Контейнеров в порту: " + port.getWarehouse().getWarehouseCurrentCapacity());
        semaphore.release();
    }

    public void addToHold(HeavyBox heavyBox) {
        if ((shipHold.size() < shipMaxContainersCount)) {
            isFull = false;
            shipHold.add(heavyBox);
        } else {
            isFull = true;
        }
    }

    public HeavyBox getFromHold() {
        if (shipHold.size() > 0) {
            isEmpty = false;
            return shipHold.remove(shipHold.size() - 1);
        } else {
            isEmpty = true;
            return null;
        }
    }

}
