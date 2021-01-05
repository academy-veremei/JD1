package by.academy.classwork.lesson5.task1_task2;

import java.util.ArrayList;

public class Deal {
    private User seller;
    private User buyer;
    private String products;
    private double finalCost;

    ArrayList< String > productsList = new ArrayList<>();

    public Deal(){
        super();
    }

    public Deal(User seller, User buyer, String products){
        super();
        this.seller = seller;
        this.buyer = buyer;
        this.products= products;
    }
    public ArrayList<String> getProductList(){
        return productsList;
    }
    public void setProductsList(ArrayList productsList){
        this.productsList = productsList;
    }
    public User getSeller(){
        return seller;
    }
    public void setSeller(User seller){
        this.seller = seller;
    }
    public User getBuyer(){
        return buyer;
    }
    public void setBuyer(User buyer){
        this.buyer = buyer;
    }
    public String getProducts(){
        return products;
    }
    public void setProducts(String products){
        this.products = products;
    }
    public double getFinalCost(){
        return finalCost;
    }
    public void setFinalCost(double productsCost){
        finalCost = finalCost + productsCost;
    }
    public void productListMaker(String name,long count,double price){
        String checkLine = "Название товара: "+name+" Количество: "+count+" Цена: "+price;
        productsList.add(checkLine);
    }
}
