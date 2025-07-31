package wipro;

public class Saving extends Bank {
    double savRate;  // percent (e.g. 0.04 for 4%)

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        // Balance = current balance + (savRate * current balance)
        return curBal + (savRate * curBal);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAccount Type: Saving" +
                "\nSaving Rate: " + (savRate * 100) + "%";
    }
}