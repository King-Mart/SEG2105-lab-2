

public class SmallBusiness extends Client {
    private String businessName;
    private int employeeCount;

    public LoanAccount requestBusinessLoan(double amount) {
        // Dummy implementation
        return new LoanAccount();
    }

    public boolean smallBusinessCheck(int employeesNum) {
        return employeeCount <= employeesNum;
    }
}
