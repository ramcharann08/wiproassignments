package wipro2;

public class Wipro9 {
	public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the total number of eggs as a command line argument.");
            return;
        }

        int eggs;
        try {
            eggs = Integer.parseInt(args[0]);
            if (eggs < 0) {
                System.out.println("Number of eggs cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer for the number of eggs.");
            return;
        }

        int gross = eggs / 144;
        int remainderAfterGross = eggs % 144;

        int dozen = remainderAfterGross / 12;
        int leftover = remainderAfterGross % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
    }
}

