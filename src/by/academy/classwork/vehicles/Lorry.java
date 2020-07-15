package by.academy.classwork.vehicles;

public class Lorry extends Car{
    private int carCarrying;

    public Lorry(){
        super();
    }
    public Lorry(int carCarrying){
        super();
        this.carCarrying = carCarrying;
    }

    public int getCarCarrying() {
        return carCarrying;
    }

    public void setCarCarrying(int carCarrying) {
        this.carCarrying = carCarrying;
    }
}
