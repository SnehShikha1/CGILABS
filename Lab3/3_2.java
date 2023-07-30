package Lab3;
import java.util.Scanner;
public class 3_2 {
   public static void main(String[] args) throws AgeException {
 Scanner sc = new Scanner(System.in);
       System.out.println("\nEnter Employee Details:");
       System.out.print("Fname : ");
       String fname = sc.nextLine();
       System.out.print("Lname : ");
       String lname = sc.nextLine();
       System.out.print("Age : ");
       Integer age = sc.nextInt();
    System.out.println("\nPerson object give age : " + age);
       Person2 person1 = new Person2(fname,lname,age);
       System.out.println("Person Details");
       System.out.println("_________________");
       System.out.println("First Name: " + person1.getFirstName());
       System.out.println("Last Name: " + person1.getLastName());
   }
}
class AgeException extends Exception {
   public AgeException(String message) {
       super(message);
   }
}
class Person2 {
   private String firstName;
   private String lastName;
   private Integer age;
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
   public Integer getAge() {
       return age;
   }
   public void setAge(Integer age) {
       this.age = age;
   }  public Person2(String firstName, String lastName, Integer age) throws AgeException {
       if(age <= 15){
           throw new AgeException("Age must be greater than 15");
       }
       this.firstName = firstName;
       this.lastName = lastName;
       this.age=age;
}
}