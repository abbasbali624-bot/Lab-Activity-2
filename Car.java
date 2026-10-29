
public class Car extends Vehicle {
    int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Doors: " + doors);
    }

    @Override
    public void moveForward() {
        System.out.println("The car drives forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("The car reverses");
    }

    @Override
    public void moveLeft() {
        System.out.println("The car turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("The car turns right");
    }
}
