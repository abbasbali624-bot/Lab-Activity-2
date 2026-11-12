public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Vios", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Click", 2021, false);
        Truck truck = new Truck("Isuzu", "Elf", 2020, 5.5);
        Printer printer = new Printer();

        Serviceable[] items = {car, motorcycle, truck, printer};

        System.out.println("--- Service ---");
        for (int i = 0; i < items.length; i++) {
            performService(items[i]);
        }

        Vehicle[] vehicles = {car, motorcycle, truck};

        System.out.println();
        System.out.println("--- Vehicles ---");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            vehicles[i].move();
            System.out.println();
        }
    }
}