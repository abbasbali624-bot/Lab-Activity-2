
public class Truck extends Vehicle {

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void moveForward() {
        System.out.println("The truck drives forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("The truck reverses slowly");
    }

    @Override
    public void moveLeft() {
        System.out.println("The truck turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("The truck turns right");
    }
}
