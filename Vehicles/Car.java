package Vehicles;

public class Car extends Vehicle {
    private final int topSpeed;

    // for demo purposes, we make gpsSystem private
    public GpsSystem gpsSystem;

    public Car(String brand, String model, String color, int topSpeed, GpsSystem gpsSystem) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
        this.gpsSystem = gpsSystem;
    }

    @Override
    public Vehicle clone() {
        Car clonedCar = (Car) super.clone();
        //clonedCar.gpsSystem = new GpsSystem();
        return clonedCar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCar {" +
                "topSpeed=" + topSpeed +
                ", gpsSystem=" + gpsSystem.getMessage() +
                '}';
    }
}