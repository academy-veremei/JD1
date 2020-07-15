package by.academy.classwork.lesson5_2.task3;

public class Matrix {
   private int matrixString;
   private int matrixColumn;
   protected int[][] matrix;

   private int resultString;
   private int resultColumn;
   private int[][] result;

   public Matrix(){
       super();
   }

   public Matrix(int[][] matrix){
       super();
       this.matrix = matrix;
       this.matrixString = matrix.length;
       this.matrixColumn = matrix[0].length;
   }
public int getResultString(){
       return resultString;
}

    public int getResultColumn() {
        return resultColumn;
    }

    public int getMatrixString(){
       return matrixString;
   }
   public int getMatrixColumn(){
       return matrixColumn;
   }
   public int[][] getMatrix(){
       return matrix;
   }

    public void matrixAddition(int[][] matrix){
       result = new int[this.resultString][this.resultColumn];
       for (int i = 0;i < this.resultString; i++){
           for (int j = 0; j < this.resultColumn;j++){
               result[i][j] = this.matrix[i][j]+matrix[i][j];
           }
       }
       matrixOutput(result);
   }

    public void matrixCompare(int matrixString, int matrixColumn){
       if (this.matrixString > matrixString){
           if (this.matrixColumn > matrixColumn){
               this.resultString = this.matrixString;
               this.resultColumn = this.matrixColumn;
           }else{
               this.resultString = this.matrixString;
               this.resultColumn = matrixColumn;
           }
       }else {
           this.resultString = matrixString;
           this.resultColumn = matrixColumn;
       }
    }

    public void matrixMultiplicationByNumber(int number){
       for (int i = 0;i < this.matrixString; i++){
           for (int j = 0; j < this.matrixColumn;j++){
               this.result[i][j] = this.matrix[i][j]*number;
           }
   }
   }

    public void matrixOutput(int[][] result){
           for (int i = 0; i < resultString; i++) {
               for (int j = 0; j < resultColumn; j++) {
                   System.out.print(" " + result[i][j] + " ");
               }
               System.out.println();
           }
        System.out.println();
   }

    public void MatrixMultiplication(int[][] matrix){
       for (int i = 0;i < result.length; i++){
           for (int j = 0; j < result[0].length;j++){
               this.result[i][j] = this.matrix[i][j]*matrix[i][j];
           }
       }
   }
}
