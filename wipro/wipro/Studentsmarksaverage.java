package wipro;

public class Studentsmarksaverage {
	public static void main(String[] args) {
        int numStudents = 3;
        
        if (args.length < numStudents) {
            System.out.println("Please provide marks for " + numStudents + " students as command-line arguments.");
            return;
        }

        int[] marks = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            try {
                int mark = Integer.parseInt(args[i]);
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid input for student " + (i + 1) + ": Mark must be between 0 and 100.");
                    return;
                }
                marks[i] = mark;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for student " + (i + 1) + ": Not a valid integer.");
                return;
            }
        }

        
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / numStudents;

        
        System.out.printf("The average is: %.2f%n", average);
    }
}