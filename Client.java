

import java.util.ArrayList;

public class Client extends Person {
    protected int clientID;
    protected String email;
    protected String phoneNumber;
    protected ArrayList<Account> accounts = new ArrayList<>();

    // Add a new Account to the association
    public boolean addAccount(Account account) {
        if (accounts.contains(account)) {
            System.err.println("Error: Account already exists for this client.");
            return false;
        }
        accounts.add(account);
        return true;
    }

    // Remove an Account from the association
    public boolean removeAccount(Account account) {
        if (!accounts.contains(account)) {
            System.err.println("Error: Account does not exist for this client.");
            return false;
        }
        accounts.remove(account);
        return true;
    }

    // List all Accounts associated with this client
    public ArrayList<Account> listAccounts() {
        return new ArrayList<>(accounts);
    }

    public double getTotalAssets() {
        double total = 0;
        for (Account acc : accounts) {
            total += acc.checkBalance();
        }
        return total;
    }
}
