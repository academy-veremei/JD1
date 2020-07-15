package by.academy.classwork.lesson5_2.task11;

public class Task11 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        System.out.println(circle.equals(rectangle));
        System.out.println(circle.equals(circle));
    }
}
