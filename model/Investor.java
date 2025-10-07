package model;

public class Investor extends Client {
    private double investmentPortfolioValue;
    private String riskToleranceLevel;

    public boolean investInProduct(String product, double amount) {
        // Dummy implementation
        return true;
    }

    public String getPortfolioSummary() {
        // Dummy implementation
        return "Summary";
    }

    public boolean sellProduct(String product, double amount) {
        // Dummy implementation
        return true;
    }

    public boolean applyForCreditCard() {
        // Dummy implementation
        return true;
    }
}
