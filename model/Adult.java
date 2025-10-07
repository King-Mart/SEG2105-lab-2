package model;

public class Adult extends Client {
    private String occupation;
    private double annualIncome;

    public LoanAccount applyForLoan(double amount) {
        // Dummy implementation
        return new LoanAccount();
    }

    public boolean requestCreditLimitIncrease() {
        // Dummy implementation
        return true;
    }
}
