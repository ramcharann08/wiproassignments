package wipro2;

public class Wipro6 {
	 public static void main(String[] args) {
	        // Get the system console
	        java.io.Console console = System.console();

	        // If running inside Eclipse, console might be null
	        if (console == null) {
	            System.out.println("No console available. Please run this program from a terminal/command prompt.");
	            System.exit(1);
	        }

	        // Take input from user as strings
	        String classesHeldStr = console.readLine("Enter the number of classes held: ");
	        String classesAttendedStr = console.readLine("Enter the number of classes attended: ");

	        // Parse inputs to integers
	        int numberOfClassesHeld = Integer.parseInt(classesHeldStr);
	        int numberOfClassesAttended = Integer.parseInt(classesAttendedStr);

	        // Calculate attendance percentage
	        double attendancePercentage = ((double) numberOfClassesAttended / numberOfClassesHeld) * 100;

	        
	        console.printf("Percentage of class attended: %.2f%%\n", attendancePercentage);

	        if (attendancePercentage >= 70) {
	            console.printf("Student is allowed to sit in exam.\n");
	        } else {
	            console.printf("Student is NOT allowed to sit in exam.\n");
	        }
	    }
	

}
