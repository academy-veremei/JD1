/*
 * Lesson 6.2 ООП.Закрепление Задание 2
 *
 * 13.07.2020
 *
 * Дмитрий Веремей
 */
package by.academy.classwork.lesson5_2.task2;

public class Person {

    private String fullName;
    private int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.fullName = "Person";
        Person person2 = new Person("Person2",22);

        person.move();
        person.talk();
        person2.move();
        person2.talk();
    }

    private Person(){
        super();
    }

    private Person(String fullName,int age){
        super();
        this.fullName = fullName;
        this.age = age;
    }

    private void move(){
        System.out.println(fullName+" идёт.");
    }
    private void talk(){
        System.out.println(fullName+" говорит.");
    }
}
