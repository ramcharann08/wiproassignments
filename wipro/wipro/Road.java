package wipro;

public class Road {
	public static void main(String[] args) {
        Truck truck = new Truck("Blue", 6, "Volvo FH", 20);
        Bus bus = new Bus("Yellow", 4, "Mercedes-Benz Tourismo", 50);
        Car car = new Car("Red", 4, "Audi A5", true);

        System.out.println("Truck details:");
        truck.displayDetails();
        truck.displayLoadCapacity();

        System.out.println("\nBus details:");
        bus.displayDetails();
        bus.displaySeatingCapacity();

        System.out.println("\nCar details:");
        car.displayDetails();
        car.displayConvertibleStatus();
    }
}
	
