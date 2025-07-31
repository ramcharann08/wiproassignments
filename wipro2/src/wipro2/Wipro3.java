/**
 * 
 */
/**
 * 
 */
package wipro2;
public class Wipro3 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide name, roll number, and field of interest as command-line arguments.");
            return;
        }
        String name = args[0];
        String roll = args[1];
        String field = args[2];

        System.out.println("Hey, my name is " + name +
                           " and my roll number is " + roll +
                           ". My field of interest are " + field + ".");
    }
}
        
       