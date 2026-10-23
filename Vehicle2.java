public abstract class Vehicle2 {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }
}