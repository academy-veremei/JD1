package by.academy.classwork.lesson5_2.task8;

public class Dog extends Animal {
    private String bark;

    public Dog(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Собака лает");
    }

    public void eat() {
        System.out.println("Собака ест");
    }
}
