package by.academy.homework.homework2.deal;

public class Huawei extends Product {
    public Huawei() {
        super();
    }

    private double calculateDiscount() {
        double productDiscount;
        if (productQuantity > 3) {
            productDiscount = 0.7;
        } else
            productDiscount = 1;
        return productDiscount;
    }

    public double productsCost() {
        return productQuantity * productPrice * calculateDiscount();
    }

}
