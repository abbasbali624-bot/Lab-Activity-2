public class Motorcycle extends Vehicle {
    private String fuelType;

    public Motorcycle(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle | Fuel: " + fuelType);
    }
}