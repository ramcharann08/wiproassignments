package wipro;

abstract class Vehiclee {
    // Abstract methods to be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Subclass Car extending Vehicle
class Car extends Vehicleee {
    @Override
    public void startEngine() {
        System.out.println("Car engine started: Turning the key and engine is running.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped: Turning the key to off position.");
    }
}

// Subclass Motorcycle extending Vehicle
class Motorcycle extends Vehiclee {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started: Kick starting the bike.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped: Cutting off the ignition.");
    }
}
   