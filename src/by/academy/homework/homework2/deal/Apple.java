package by.academy.homework.homework2.deal;

public class Apple extends Product {
    public Apple() {
        super();
    }

    private double calculateDiscount() {
        int productDiscount;
        if (productQuantity > 3) {
            productDiscount = 1000;
        } else
            productDiscount = 100;
        return productDiscount;
    }

    public double productsCost() {
        return productQuantity * productPrice * calculateDiscount();
    }

}
