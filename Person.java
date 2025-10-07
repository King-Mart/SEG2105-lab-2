

import java.util.Date;

public class Person {
    protected String email;
    protected String name;
    protected String phoneNumber;
    protected Date dateOfBirth;

    public String getFullName() {
        return name;
    }

    public int calculateAge() {
        // Simple age calculation
        Date now = new Date();
        return now.getYear() - dateOfBirth.getYear();
    }
}
