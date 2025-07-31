package wipro2;

public class Wipro10 {
	public void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + result);
    }

    // Method to find difference of two numbers and display the result
    public void diff(double a, double b) {
        double result = a - b;
        System.out.println("Difference: " + a + " - " + b + " = " + result);
    }

    // Method to multiply two numbers and display the result
    public void mul(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }

    // Method to divide two numbers and display the result with check
    public void div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division: " + a + " / " + b + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Example numbers
        double num1 = 20.0;
        double num2 = 5.0;

        // Calling the methods
        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}

