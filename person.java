package Assignn;
import java.time.LocalDate;
import java.time.Period;


public class person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    public person() {
        this.firstName = "";
        this.lastName = "";
    }
    public person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int calculateAge() {
        if (dateOfBirth == null) {
            return 0;
        }
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public static void main(String[] args) {
        person person1 = new person();

        person1.setFirstName("Divya");
        person1.setLastName("Bharti");
        person1.setDateOfBirth(LocalDate.of(2000, 5, 23); 
        System.out.println("First name: " + person1.getFirstName());
        System.out.println("Last name: " + person1.getLastName());
        System.out.println("Age: " + person1.calculateAge());
    }
}

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
