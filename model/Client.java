package model;

import java.util.ArrayList;

public class Client extends Person {
    protected int clientID;
    protected String email;
    protected String phoneNumber;
    protected ArrayList<Account> accounts = new ArrayList<>();

    public Account openAccount(Account accountType) {
        accounts.add(accountType);
        return accountType;
    }

    public boolean closeAccount(Account account) {
        return accounts.remove(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public double getTotalAssets() {
        double total = 0;
        for (Account acc : accounts) {
            total += acc.checkBalance();
        }
        return total;
    }
}
