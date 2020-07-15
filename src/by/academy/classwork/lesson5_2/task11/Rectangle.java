package by.academy.classwork.lesson5_2.task11;

public class Rectangle extends Shape {
    String[][] rectangle = new String[][]{
            {"*", "*", "*", "*", "*", "*", "*"},
            {"*", " ", " ", " ", " ", " ", "*"},
            {"*", " ", " ", " ", " ", " ", "*"},
            {"*", " ", " ", " ", " ", " ", "*"},
            {"*", " ", " ", " ", " ", " ", "*"},
            {"*", " ", " ", " ", " ", " ", "*"},
            {"*", "*", "*", "*", "*", "*", "*"},

    };

    public void draw() {
        super.draw();
        for (int i = 0; i < this.rectangle.length; i++) {
            for (int j = 0; j < this.rectangle[0].length; j++) {
                System.out.print(" " + rectangle[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
