package Vehicles;

public class Bus extends Vehicle {

    private final int doors;

    public Bus(String brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    @Override
    public Bus clone() {
        return (Bus) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + "\nBrand: " + getBrand() + "\nModel: " + getModel();
    }
}