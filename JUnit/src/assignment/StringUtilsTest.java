package assignment;

public class StringUtilsTest {
	public static void main(String[] args) {
        // Test with null input
        testReverse(null, null, "Null input");

        // Test with empty string
        testReverse("", "", "Empty string input");

        // Test with regular string
        testReverse("hello", "olleh", "Regular string input");

        System.out.println("All tests completed.");
    }

    private static void testReverse(String input, String expected, String testCase) {
        String result = StringUtils.reverse(input);
        if ((result == null && expected == null) || (result != null && result.equals(expected))) {
            System.out.println("PASSED: " + testCase);
        } else {
            System.out.println("FAILED: " + testCase + ". Expected: " + expected + ", but got: " + result);
        }
    }
}
	

