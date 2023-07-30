package Lab2;					
import java.util.Random;					
public class 2_5{					
public static void main(String[] args){					
Person person = new Person("Sneh", 23);					
AbstractAccount account = new AbstractAccount(2000, person) {					
@Override					
public void withdraw(double amount) {					
double curBalance = getBalance()-amount;					
if(curBalance >= 0){					
setBalance(curBalance);					
System.out.println("Amount = " + amount + " Withdraw successfull");					
}else{					
System.out.println("You dont have enough balance to withdraw");					
}					
}					
};					
System.out.println("Account Details:");					
account.printDetails();					
System.out.println("\nWithdraw operation:");					
account.withdraw(200);					
account.withdraw(2000);					
}					
}					
abstract class AbstractAccount {					
private Integer accNum;					
private double balance;					
private Person accHolder;					
public AbstractAccount(double balance, Person accHolder) {					
Random rnd = new Random();					
this.accNum = rnd.nextInt(900000) + 100000;					
this.balance = balance;					
this.accHolder = accHolder;					
}					
public abstract void withdraw(double amount);					
public double getBalance() {					
return balance;					
}					
public void setBalance(double balance) {					
this.balance = balance;					
}					
public void printDetails(){					
System.out.println("Account Number : " + this.accNum);					
System.out.println("Account Balance : " + this.balance);					
System.out.println("AccHolder name : " + this.accHolder.getName());					
System.out.println("AccHolder Age : " + this.accHolder.getAge());					
}					
}