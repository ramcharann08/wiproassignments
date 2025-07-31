package assignment;

public class StringUtils {
	public static String reverse(String input) {
        if (input == null) {
            return null; // or you can throw an exception if preferred
        }
        
        return new StringBuilder(input).reverse().toString();
    }

}
