package by.academy.classwork.details;

public class Engine {
    private int enginePower;
    private String engineManufacturer;

    public Engine(){
        super();
    }
    public Engine(int enginePower,String engineManufacturer){
        super();
        this.enginePower = enginePower;
        this.engineManufacturer = engineManufacturer;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
