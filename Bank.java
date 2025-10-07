

import java.util.ArrayList;

public class Bank {
    private String name;
    private String bankID;
    private ArrayList<Person> persons = new ArrayList<>();

    // Association management for Person
    public boolean addPerson(Person person) {
        if (persons.contains(person)) {
            System.err.println("Error: Person already exists in this bank.");
            return false;
        }
        persons.add(person);
        return true;
    }

    public boolean removePerson(Person person) {
        if (!persons.contains(person)) {
            System.err.println("Error: Person does not exist in this bank.");
            return false;
        }
        persons.remove(person);
        return true;
    }

    public ArrayList<Person> listPersons() {
        return new ArrayList<>(persons);
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBankID() { return bankID; }
    public void setBankID(String bankID) { this.bankID = bankID; }
}
