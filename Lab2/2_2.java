package Lab2;					
public class 2_2 {					
public static void main(String[] args){					
System.out.println("\nTask 2.2.1 Operations on savings account");					
Person person1 = new Person("Deven", 22);					
Savings savings1 = new Savings(2000, person1);					
savings1.printSavingAccountDetails();					
savings1.Withdraw(800);					
savings1.Withdraw(500);					
System.out.println("\nTask 2.2.2 Operations on Current account");					
Person person2 = new Person("Janu", 20);					
Current current1 = new Current(10000, person2);					
current1.printCurrentAccountDetails();					
current1.Withdraw(25000);					
current1.Withdraw(15000);					
}					
}					
class Savings extends Account{					
private final double minimumBalance = 1000;					
public Savings(double balance, Person accHolder) {					
super(balance, accHolder);					
}					
@Override					
public void Withdraw(double amount){					
if((getBalance() - amount) < minimumBalance){					
System.out.println("Minimum balance must be maintained, try <" + amount + " to withdraw");					
System.out.println("Available Balance = " + getBalance());					
}else{					
setBalance(getBalance()-amount);					
System.out.println("Amount " + amount + " withdraw successfull");					
System.out.println("Available Balance = " + getBalance());					
}					
}					
public void printSavingAccountDetails(){					
printDetails();					
System.out.println("Minimum Balance required : " + minimumBalance + "\n");					
}					
}					
class Current extends Account{					
private final double overdraftLimit = -10000;					
public Current(double balance, Person accHolder) {					
super(balance, accHolder);					
}					
@Override					
public void Withdraw(double amount){					
double currBalance = getBalance() - amount;					
if(currBalance < 0 && currBalance < overdraftLimit){					
System.out.println("You will exceed overdraft limit try <" + amount + " to withdraw");					
}else{					
setBalance(getBalance()-amount);					
System.out.println("Amount " + amount + " withdraw successfull");					
System.out.println("Current Balance = " + getBalance());					
}					
}					
public void printCurrentAccountDetails(){					
printDetails();					
System.out.println("OverDraft Limit : " + overdraftLimit + "\n");					
}					
}