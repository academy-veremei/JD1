package by.academy.classwork.lesson5.task1_task2;

public class Huawei extends Product {
    public Huawei(){
        super();
    }

    private double calculateDiscount(){
        double productDiscount;
        if (productQuantity > 3){
            productDiscount = 0.7;
        }else
            productDiscount = 1;
        return productDiscount;
    }

    public double productsCost(){
        return productQuantity*productPrice*calculateDiscount();
    }

}
