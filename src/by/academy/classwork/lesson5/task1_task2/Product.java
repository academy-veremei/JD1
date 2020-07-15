package by.academy.classwork.lesson5.task1_task2;

public class Product{
    protected double productPrice;
    protected String productName;
    protected long productQuantity;

    public Product(){
        super();
    }
    public Product(String productName,long productQuantity,double productPrice){
        super();
        this.productPrice = productPrice;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public double getProductPrice(){
        return productPrice;
    }
    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public long getProductQuantity(){
        return productQuantity;
    }
    public void setProductQuantity(long productQuantity){
        this.productQuantity = productQuantity;
    }

    private double calculateDiscount(){
        double productDiscount;
        if (productQuantity > 5){
            productDiscount = 0.8;
        }else
            productDiscount = 1;
        return productDiscount;
    }

    public double productsCost(){
        return productQuantity*productPrice*calculateDiscount();
    }
}
