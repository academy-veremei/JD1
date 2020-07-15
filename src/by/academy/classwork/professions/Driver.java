package by.academy.classwork.professions;

public class Driver {
    private String driverFullName;
    private int driverExperience;

    public Driver(){
        super();
    }
    public Driver(String driverFullName,int driverExperience){
        super();
        this.driverFullName = driverFullName;
        this.driverExperience = driverExperience;
    }

    public String getDriverFullName() {
        return driverFullName;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverFullName(String driverFullName) {
        this.driverFullName = driverFullName;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
}
