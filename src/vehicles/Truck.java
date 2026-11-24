package vehicles;

import contracts.Serviceable;

public class Truck extends Vehicle implements Serviceable {
    private double cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo capacity: " + cargoCapacity + " tons");
    }

    @Override
    public void move() {
        System.out.println("The truck is hauling cargo.");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}
