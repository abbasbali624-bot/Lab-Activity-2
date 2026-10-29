
public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("Honda", "Civic", 2023, 4),
            new Truck("Mitsubishi", "Fuso", 2022),
            new Motorcycle("Kawasaki", "Ninja", 2024, "Manual")
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("\n=== "
                + vehicle.getClass().getSimpleName() + " ===");

            vehicle.printDetails();
            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();
        }
    }
}
