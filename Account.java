

public class Account {
    protected int id;
    protected String password;
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(Account account, double amount) {
        if (withdraw(amount)) {
            account.deposit(amount);
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }
}
