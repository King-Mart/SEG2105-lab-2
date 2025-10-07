

public class LoanAccount extends Account implements InterestAccount {
    private double interestRate;
    private String repaymentSchedule;

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest() {
        // Dummy implementation
        return balance * interestRate;
    }

    public double getOutstanding() {
        // Dummy implementation
        return 0;
    }

    public void makeScheduled() {
        // Dummy implementation
    }

    public boolean reschedule() {
        // Dummy implementation
        return true;
    }
}
