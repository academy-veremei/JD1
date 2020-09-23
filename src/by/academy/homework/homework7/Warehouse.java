package by.academy.homework.homework7;

import by.academy.classwork.lesson_03_08.HeavyBox;

import java.util.ArrayList;
import java.util.Random;

public class Warehouse extends Thread {
    private final int warehouseMaxCapacity = 10_000;
    private ArrayList<HeavyBox> warehouse;

    public Warehouse() {
        warehouse = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            addToWarehouse(new HeavyBox(random.nextInt(100)));
        }
    }

    public synchronized HeavyBox getFromWarehouse() {
        if (warehouse.size() > 0) {

            return warehouse.remove(warehouse.size() - 1);

        } else if (warehouse.size() == 1) {

            return warehouse.remove(warehouse.size());

        } else {
            try {
                wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return warehouse.remove(warehouse.size() - 1);
        }
    }

    public synchronized void addToWarehouse(HeavyBox heavyBox) {
        if (warehouse.size() <= warehouseMaxCapacity) {
            warehouse.add(heavyBox);
        } else {
            try {
                wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            warehouse.add(heavyBox);
        }
    }

    public int getWarehouseCurrentCapacity() {
        return warehouse.size();
    }

}
