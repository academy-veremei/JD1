package by.academy.classwork.lesson5_2.task3;

public class Task3 {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(new int[][]{
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}}
                );
        Matrix secondMatrix = new Matrix(new int[][]{
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}}
                );

        firstMatrix.matrixMultiplicationByNumber(4);
        firstMatrix.matrixAddition(secondMatrix.getMatrix());
        firstMatrix.matrixMultiplication(secondMatrix.getMatrix());
    }
}
