package Lab3;
import java.util.Scanner;
public class 3_1 {
   public static void main(String[] args) throws BlankNameException {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nEnter Employee Details:");
       System.out.print("Fname : ");
       String fname = sc.nextLine();
       System.out.print("Lname : ");
       String lname = sc.nextLine();
       System.out.println("\nIf fname or lname is not given");
       Person person1 = new Person(fname,lname);
       System.out.println("Person Details");
       System.out.println("_________________");
       System.out.println("First Name: " + person1.getFirstName());
       System.out.println("Last Name: " + person1.getLastName());
   }
}
class BlankNameException extends Exception {
   public BlankNameException(String message) {
       super(message);
   }
}
class Person {
   private String firstName;
   private String lastName;
   private String fullName;
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
   }
   public String getFullName() {
       return fullName;
   }
   public void setFullName(String fullName) {
       this.fullName = fullName;
   }
   public Person(String firstName, String lastName) throws BlankNameException {
       if(firstName.trim().isEmpty() || lastName.trim().isEmpty()){
           throw new BlankNameException("FirstName and LastName cannot be blank");
       }
       this.firstName = firstName;
       this.lastName = lastName;
       this.fullName = firstName + " " + lastName;
   }
}