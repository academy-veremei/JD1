package by.academy.homework.homework2.deal;

public class Xiaomi extends Product {
    public Xiaomi() {
        super();
    }

    private double calculateDiscount() {
        double productDiscount;
        if (productQuantity > 3) {
            productDiscount = 0.6;
        } else
            productDiscount = 1;
        return productDiscount;
    }

    public double productsCost() {
        return productQuantity * productPrice * calculateDiscount();
    }
}
