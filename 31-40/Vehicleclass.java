/**
 * Vehicle
 */
class Vehicle {
    void drive() {
        System.out.println("Driveable");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Message before overriding: ");
        super.drive();
        System.out.println("Message after overriding: ");
        System.out.println("Repairing a car");
    }
}

public class Vehicleclass {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
    }
}
