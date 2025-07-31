package wipro2;

public class Wipro5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the marks as a command-line argument.");
            return;
        }

        int marks;
        try {
            marks = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer for marks.");
            return;
        }

        char grade;

        if (marks < 25) {
            grade = 'F';
        } else if (marks >= 25 && marks < 45) {
            grade = 'E';
        } else if (marks >= 45 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'C';
        } else if (marks >= 60 && marks <= 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is: " + grade);
    }

}
