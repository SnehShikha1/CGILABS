package Lab2;			
import java.util.Random;			
public class 2_1 {			
public static void main(String[] args){			
System.out.println("\nTask-2.1.1");			
// creating account for smith			
Person person1 = new Person("smith", 22);			
Account account1 = new Account(2000, person1);			
System.out.println("Smith Account Details:");			
account1.printDetails();			
// creating account for Kathy			
System.out.println("Kathy Account Details:");			
Person person2 = new Person("Kathy", 23);			
Account account2 = new Account(3000, person2);			
account2.printDetails();			
System.out.println("Task-2.1.2 Deposit 2000 to smith account");			
account1.Deposit(2000);			
System.out.println("Smith Account Balance = " + account1.getBalance());			
System.out.println("Task-2.1.3 Withdraw 2000 from Kathy account");			
account2.Withdraw(2000);			
System.out.println("Kathy Account Balance = " + account2.getBalance());			
System.out.println("\ntoString() method on account class : \n");			
System.out.println("for smith account : " + account1.toString());			
System.out.println("for Kathy account : " + account2.toString());			
}			
}			
class Account{			
private Integer accNum;			
private double balance;			
private Person accHolder;			
public Account(double balance, Person accHolder) {			
Random rnd = new Random();			
this.accNum = rnd.nextInt(900000) + 100000;			
this.balance = balance;			
this.accHolder = accHolder;			
}			
public void Deposit(double amount){			
this.balance += amount;			
}			
public void Withdraw(double amount){			
this.balance -= amount;			
}			
public Integer getAccNum() {			
return accNum;			
}			
public void setAccNum(Integer accNum) {			
this.accNum = accNum;			
}			
public double getBalance() {			
return balance;			
}			
public void setBalance(double balance) {			
this.balance = balance;			
}			
public Person getAccHolder() {			
return accHolder;			
}			
public void setAccHolder(Person accHolder) {			
this.accHolder = accHolder;			
}			
public void printDetails(){			
System.out.println("Account Number : " + this.accNum);			
System.out.println("Account Balance : " + this.balance);			
System.out.println("AccHolder name : " + this.accHolder.getName());			
System.out.println("AccHolder Age : " + this.accHolder.getAge()+ "\n");			
}			
}			
class Person{			
private String name;			
private float age;			
public String getName() {			
return name;			
}			
public void setName(String name) {			
this.name = name;			
}			
public float getAge() {			
return age;			
}			
public void setAge(float age) {			
this.age = age;			
}			
public Person(String name, float age) {			
this.name = name;			
this.age = age;			
}			
}