package assignment;

public class FactorialTest {
	   public static void main(String[] args) {
	        // Test for valid inputs
	        testFactorial(0, 1);    // 0! = 1
	        testFactorial(1, 1);    // 1! = 1
	        testFactorial(5, 120);  // 5! = 120
	        testFactorial(10, 3628800); // 10! = 3628800

	        // Test for negative input
	        testFactorialNegative(-3);

	        System.out.println("All tests finished.");
	    }

	    // Helper method for valid input test
	    private static void testFactorial(int input, long expected) {
	        long result = MathUtils.factorial(input);
	        if (result == expected) {
	            System.out.println("Test passed for input " + input);
	        } else {
	            System.out.println("Test FAILED for input " + input + ". Expected " + expected + " but got " + result);
	        }
	    }

	    // Helper method for negative input test
	    private static void testFactorialNegative(int input) {
	        try {
	            MathUtils.factorial(input);
	            System.out.println("Test FAILED for negative input " + input + ". Exception was not thrown.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Test passed for negative input " + input + ": Exception thrown as expected.");
	        }
	    }
	}

