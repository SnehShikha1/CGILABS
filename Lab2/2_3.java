Com.cg.eis.bean = Employee class			
package Lab2.com.cg.eis.bean;			
public class Employee {			
private Integer id;			
private String name;			
private Integer salary;			
private String designation;			
private String insuranceScheme;			
public Employee(Integer id, String name, Integer salary, String designation) {			
this.id = id;			
this.name = name;			
this.salary = salary;			
this.designation = designation;			
if(salary > 50000 && designation=="SE"){			
this.insuranceScheme = "10Lakhs Scheme";			
}else{			
this.insuranceScheme = "5Lakhs Scheme";			
}			
}			
public Integer getId() {			
return id;			
}			
public void setId(Integer id) {			
this.id = id;			
}			
public String getName() {			
return name;			
}			
public void setName(String name) {			
this.name = name;			
}			
public Integer getSalary() {			
return salary;			
}			
public void setSalary(Integer salary) {			
this.salary = salary;			
}			
public String getDesignation() {			
return designation;			
}			
public void setDesignation(String designation) {			
this.designation = designation;			
}			
public String getInsuranceScheme() {			
return insuranceScheme;			
}			
public void setInsuranceScheme(String insuranceScheme) {			
this.insuranceScheme = insuranceScheme;			
}			
}			
			
Com.cg.eis.service = EmployeeService interface			
			
package Lab2.com.cg.eis.service;			
import Lab2.com.cg.eis.bean.Employee;			
public interface EmployeeService{			
void findEmployeeDetails(Employee employee);			
String findInsuranceScheme(Integer salary);			
}			
Com.cg.eis.service = ServiceImplementation class			
			
package Lab2.com.cg.eis.service;			
import Lab2.com.cg.eis.bean.Employee;			
public class ServiceImplementation implements EmployeeService{			
@Override			
public void findEmployeeDetails(Employee employee){			
System.out.println("Employee Details:");			
System.out.println("Employee Id : " + employee.getId());			
System.out.println("Employee Name : " + employee.getName());			
System.out.println("Salary : " + employee.getSalary());			
System.out.println("Designation : " + employee.getDesignation());			
System.out.println("Insurance Scheme : " + employee.getInsuranceScheme());			
System.out.println("\n");			
}			
@Override			
public String findInsuranceScheme(Integer salary) {			
if(salary > 50000){			
return "10Lakhs Scheme";			
}else{			
return "5Lakhs Scheme";			
}			
}			
}			
Com.cg.eis.pl = Main class			
package Lab2.com.cg.eis.pl;			
import Lab2.com.cg.eis.bean.Employee;			
import Lab2.com.cg.eis.service.EmployeeService;			
import Lab2.com.cg.eis.service.ServiceImplementation;			
import java.util.Scanner;			
public class Main {			
public static void main(String[] args){			
Scanner sc = new Scanner(System.in);			
System.out.println("\nProvide the user details:");			
System.out.print("ID : ");			
Integer id = sc.nextInt();			
sc.nextLine();			
System.out.print("Name : ");			
String name = sc.nextLine();			
System.out.print("Salary : ");			
Integer salary = sc.nextInt();			
sc.nextLine();			
System.out.print("Designation : ");			
String designation = sc.nextLine();			
Employee employee = new Employee(id,name,salary, designation);			
EmployeeService employeeService = new ServiceImplementation();			
System.out.println("\nService-1 Employee Details:");			
employeeService.findEmployeeDetails(employee);			
System.out.println("Service-2 Find Insurance Scheme:");			
String scheme = employeeService.findInsuranceScheme(employee.getSalary());			
System.out.println("User insurance scheme : " + scheme);			
}			
}