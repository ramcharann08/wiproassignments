package wipro;

public class Vehicle {
	protected String color;
    protected int noOfWheels;
    protected String model;

    // Constructor to initialize common variables
    public Vehicle(String color, int noOfWheels, String model) {
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.model = model;
    }

    // Common method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + noOfWheels);
    }
}

// Truck subclass with a specific method
class Truck extends Vehicle {
    private int loadCapacity; // in tons

    public Truck(String color, int noOfWheels, String model, int loadCapacity) {
        super(color, noOfWheels, model);
        this.loadCapacity = loadCapacity;
    }

    // Specific method for Truck
    public void displayLoadCapacity() {
        System.out.println("Truck Load Capacity: " + loadCapacity + " tons");
    }
}

// Bus subclass with a specific method
class Bus extends Vehicle {
    private int seatingCapacity;

    public Bus(String color, int noOfWheels, String model, int seatingCapacity) {
        super(color, noOfWheels, model);
        this.seatingCapacity = seatingCapacity;
    }

    // Specific method for Bus
    public void displaySeatingCapacity() {
        System.out.println("Bus Seating Capacity: " + seatingCapacity + " passengers");
    }
}

// Car subclass with a specific method
class Car extends Vehicle {
    private boolean isConvertible;

    public Car(String color, int noOfWheels, String model, boolean isConvertible) {
        super(color, noOfWheels, model);
        this.isConvertible = isConvertible;
    }

    // Specific method for Car
    public void displayConvertibleStatus() {
        String status = isConvertible ? "Convertible" : "Non-Convertible";
        System.out.println("Car Type: " + status);
    }
}

