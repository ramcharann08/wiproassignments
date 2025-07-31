package wipro2;

public class Wipro7 {
	public static void main(String[] args) {
        float attendance = 0;
        String medicalCause = "N";

        if (args.length >= 2) {
            try {
                attendance = Float.parseFloat(args[0]);
                medicalCause = args[1];
            } catch (NumberFormatException e) {
                System.out.println("Invalid attendance input. Please enter a valid number.");
                return;
            }
        } else {
            // You can hardcode values here if no input is provided
            attendance = 80;    // default attendance
            medicalCause = "N"; // default medical cause
            System.out.println("No input provided, using default values:");
            System.out.println("Attendance = " + attendance);
            System.out.println("Medical cause = " + medicalCause);
        }

        if (attendance >= 75 || medicalCause.equalsIgnoreCase("Y")) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is not allowed to sit for the exam.");
        }
    }
}


