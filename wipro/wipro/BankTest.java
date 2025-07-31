package wipro;

public class BankTest {
    public static void main(String[] args) {
        Bank[] accounts = {
            new Saving("S101", "Alice", 2, "Teacher", 5000.0, 0.04),
            new Current("C102", "Bob", 1, "Engineer", 4000.0, true, 0.03),
            new Saving("S103", "Carol", 2, "Nurse", 7000.0, 0.0375),
            new Current("C104", "Dave", 1, "Lawyer", 9000.0, false, 0.025)
        };

        // a) Demonstrate calcBalance for each account
        System.out.println("Account balances after interest/fees:");
        for (Bank acc : accounts) {
            System.out.println("------");
            System.out.println(acc);
            System.out.printf("Computed Balance: RM%.2f\n", acc.calcBalance());
        }

        // b) Search for customer by account number
        String searchAccNo = "C104";
        boolean found = false;
        for (Bank acc : accounts) {
            if (acc.accNo.equals(searchAccNo)) {
                System.out.println("\nCustomer found:\n------\n" + acc);
                System.out.printf("Computed Balance: RM%.2f\n", acc.calcBalance());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nCustomer with account number " + searchAccNo + " not found.");
        }

        // c) Count current accounts & total balance
        int curCount = 0;
        double curTotal = 0.0;
        for (Bank acc : accounts) {
            if (acc instanceof Current) {
                curCount++;
                curTotal += acc.calcBalance();
            }
        }
        System.out.printf("\nCurrent account count: %d, Total balance: RM%.2f\n", curCount, curTotal);
    }
}
