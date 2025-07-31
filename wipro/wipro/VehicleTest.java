package wipro;

public class VehicleTest {
	public static void main(String[] args) {
        Vehiclee car = new Car();
        Vehiclee motorcycle = new Motorcycle();

        // Operating the Car
        car.startEngine();
        car.stopEngine();

        System.out.println();

        // Operating the Motorcycle
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

