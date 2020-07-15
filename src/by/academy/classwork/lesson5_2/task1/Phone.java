package by.academy.classwork.lesson5_2.task1;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(){
        super();
    }
    public Phone(int number,String model,double weight){
        super();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void setPhone(int number,String model,double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public void setPhone(int number,double weight){
        this.number = number;
        this.weight = weight;
    }
    public int getNumber(){
        return  number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }
    public void sendMessage(int... number){
        for (int i : number) {
            System.out.print(i + " ");
        }
    }
}
