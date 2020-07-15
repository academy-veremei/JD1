package by.academy.classwork.lesson5.task1_task2;

public class Apple extends Product {
    public Apple(){
        super();
    }

    private double calculateDiscount(){
        int productDiscount;
        if (productQuantity > 3){
              productDiscount = 1000;
          }else
              productDiscount = 100;
          return productDiscount;
    }

    public double productsCost(){
        return productQuantity*productPrice*calculateDiscount();
    }

}
