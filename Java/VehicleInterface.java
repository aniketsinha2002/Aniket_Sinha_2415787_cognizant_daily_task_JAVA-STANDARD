// ACTIVITY - INTERFACE

// Create an interface Vehicle with methods start() and stop(). Implement it in Car and Bike classes.

interface Vehicle {
    //abstract methods (methods without a body)
    void start();
    void stop();
}

//lass Car implements the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

//class Bike implements the Vehicle interface
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class VehicleInterface {
    public static void main(String[] args) {
        Vehicle car = new Car(); // Creating a Car object and assigning it to a variable of type Vehicle.
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
