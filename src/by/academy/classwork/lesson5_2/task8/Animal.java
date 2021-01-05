package by.academy.classwork.lesson5_2.task8;

public class Animal {
    private String food;
    private String location;

    public Animal() {
        super();
    }

    public Animal(String food, String location) {
        super();
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное шумит");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
