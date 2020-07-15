package by.academy.classwork.lesson5_2.task8;

public class Horse extends Animal{
    private String meow;

    public Horse(String food,String location){
        super(food,location);
    }
    public void makeNoise(){
        System.out.println("Лошадь ржет");
    }
    public void eat(){
        System.out.println("Лошадь ест");
    }
}
