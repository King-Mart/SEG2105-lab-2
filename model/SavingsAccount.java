package model;

public class SavingsAccount extends Account implements InterestAccount {
    private double interestRate;
    private int monthlyWithdrawalLimit;

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public double totalInterest() {
        // Dummy implementation
        return 0;
    }
}
