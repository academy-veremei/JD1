package by.academy.classwork.lesson5_2.task8;

public class Cat extends Animal {
    private String neigh;

    public Cat(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Кошка мяучет");
    }

    public void eat() {
        System.out.println("Кошка ест");
    }
}
