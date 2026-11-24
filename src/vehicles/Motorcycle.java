package vehicles;

import contracts.Serviceable;

public class Motorcycle extends Vehicle implements Serviceable {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is riding.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}
