package wipro2;

public class Wipro4 {
	public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide salary and years of service as command-line arguments.");
            return;
        }
        double salary = Double.parseDouble(args[0]);
        int years = Integer.parseInt(args[1]);
        double bonus = 0;
        if (years > 6) {
            bonus = salary * 0.10;
        }
        System.out.println("Your net bonus amount is: " + bonus);
	    }
	}