package by.academy.classwork.lesson5_2.task2;

public class Person {

    protected String fullName;
    protected int age;

    public Person() {
        super();
    }

    public Person(String fullName, int age) {
        super();
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " идёт.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }

}
