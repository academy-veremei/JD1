package by.academy.classwork.lesson5_2.task11;

public class Circle extends Shape {
    String[][] circle = new String[][]{
            {" ", " ", "", " ", " ", " ", " "},
            {" ", " ", "*", "*", "*", " ", " "},
            {" ", " *", " ", " ", " *", " ", " "},
            {" ", "*", " ", " ", " ", "*", " "},
            {" ", "*", " ", " ", " ", "*", " "},
            {" ", " *", " ", " ", " *", " ", " "},
            {" ", " ", "*", "*", "*", " ", " "},

    };

    public Circle() {
        super();
    }

    @Override
    public void draw() {
        super.draw();
        for (int i = 0; i < this.circle.length; i++) {
            for (int j = 0; j < this.circle[0].length; j++) {
                System.out.print(" " + circle[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
