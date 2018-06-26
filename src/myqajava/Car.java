package myqajava;

public class Car extends Vehicle {

    int numberOfWheels;
    String owner;
    double cost;
    String vehicleType = "car";

    public Car(int numberOfWheels, double cost, String owner){
        this.numberOfWheels = numberOfWheels;
        this.owner = owner;
        this.cost = cost;

    }
    
    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void setOwner(String owner) {

        this.owner = owner;

    }

    @Override
    public void setCost(double cost) {

        this.cost = cost;

    }

    @Override
    public int getNumberOfWheels() {

        return this.numberOfWheels;

    }

    @Override
    public String getOwner() {
        
        return this.owner = owner;

    }

    @Override
    public double getCost() {

        return this.cost;
    }

    @Override
    public String getVehicleType() {

        return this.vehicleType;
    }

}
