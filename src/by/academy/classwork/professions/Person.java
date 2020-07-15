package by.academy.classwork.professions;

public class Person extends Driver{
    private int age;

    public Person(){
        super();
    }
    public Person(int age){
        super();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
