package by.academy.classwork.lesson5_2.task3;

public class Matrix {
   private int matrixString;
   private int matrixColumn;
   protected int[][] matrix;



   public Matrix(){
       super();
   }

   public Matrix(int[][] matrix){
       super();
       this.matrix = matrix;
       this.matrixString = matrix.length;
       this.matrixColumn = matrix[0].length;
   }

    public int getMatrixString(){
       return matrixString;
   }
    public int getMatrixColumn(){
       return matrixColumn;
   }
    public int[][] getMatrix(){
       return this.matrix;
   }

    public void matrixAddition(int[][] matrix){
        int[][] result = new int[matrixString][matrixColumn];
       System.out.println("Сложение");
       for (int i = 0;i < this.matrixString; i++){
           for (int j = 0; j < this.matrixColumn;j++){
               result[i][j] = this.matrix[i][j]+matrix[i][j];
           }
       }
       matrixOutput(result);
   }

    public void matrixMultiplicationByNumber(int number){
       int[][] result = new int[matrixString][matrixColumn];
        System.out.println("Умножение на число");
       for (int i = 0;i < this.matrixString; i++){
           for (int j = 0; j < this.matrixColumn;j++){
               result[i][j] = this.matrix[i][j]*number;
           }
       }
        matrixOutput(result);
   }

    public void matrixOutput(int[][] result){
           for (int i = 0; i < this.matrixString; i++) {
               for (int j = 0; j < this.matrixColumn; j++) {
                   System.out.print(" " + result[i][j] + " ");
               }
               System.out.println();
           }
        System.out.println();
   }

    public void matrixMultiplication(int[][] matrix){
        int[][] result = new int[matrixString][matrixColumn];
        System.out.println("Умножение");
       for (int i = 0;i < this.matrixString; i++){
           for (int j = 0; j < this.matrixColumn;j++){
               result[i][j] = this.matrix[i][j]*matrix[i][j];
           }
       }
        matrixOutput(result);
   }
}
