public class main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2024);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2011);
        Vehicle vehicle3 = new Vehicle("BMW", "M3", 2024);

        System.out.println("=== VEHICLE 1 ===");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        System.out.println("=== VEHICLE 2 ===");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        System.out.println("=== VEHICLE 3 ===");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());

        System.out.println("\n=== Getters ===");
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());

        System.out.println("\n=== setYear(2000) ===");
        System.out.println("Return value: " + vehicle1.setYear(2000));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println("\n=== setYear(1885) ===");
        System.out.println("Return value: " + vehicle1.setYear(1885));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println("\n=== setYear(2027) ===");
        System.out.println("Return value: " + vehicle1.setYear(2027));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println("\n=== Constructor with year 1885 ===");
        Vehicle invalidVehicle1 = new Vehicle("Test", "Invalid1885", 1885);
        System.out.println("Initial year: " + invalidVehicle1.getYear());

        System.out.println("\n=== Constructor with year 2027 ===");
        Vehicle invalidVehicle2 = new Vehicle("Test", "Invalid2027", 2027);
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}