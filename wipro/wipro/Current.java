package wipro;

public class Current extends Bank {
    boolean fixedDep;
    double curRate; // percent (e.g. 0.03 for 3%)

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.fixedDep = fixedDep;
        this.curRate = curRate;
    }

    @Override
    public double calcBalance() {
        // Balance = current balance + (curRate * current balance), minus RM150/year if fixed deposit exists
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150.0;
        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAccount Type: Current" +
                "\nCurrent Rate: " + (curRate * 100) + "%" +
                "\nFixed Deposit: " + (fixedDep ? "Yes" : "No");
    }
}