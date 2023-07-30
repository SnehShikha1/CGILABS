Com.cg.eis.exception = EmployeeException class
package Lab3.com.cg.eis.exception;
public class EmployeeException extends Exception{
   public EmployeeException(String message) {
       super(message);
   }
}Main Class code: 3_3
package Lab3;
import Lab3.com.cg.eis.exception.EmployeeException;
import java.util.Scanner;
public class Q33 {
   public static void main(String[] args) throws EmployeeException {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nEnter Employee Details:");
       System.out.print("Name : ");
       String name = sc.nextLine();
       System.out.print("Salary : ");
       Double salary = sc.nextDouble();
       try{
           Employee employee = new Employee(name,salary);
           employee.PrintDetails();
       }catch (EmployeeException e) {
           System.out.println("Error: " + e.getMessage());
       }
   }
}
class Employee{
   private String name;
   private double salary;


   public  Employee(String name, double salary) throws EmployeeException {
       if(salary < 3000){
           throw new EmployeeException("Salary is <3000");
       }
       this.name = name;
       this.salary = salary;
   }


   public void PrintDetails(){
       System.out.println("\nName : " + this.name);
       System.out.println("Salary : " + this.salary);
}
}