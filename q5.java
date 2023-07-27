package Assignn;

import java.util.Scanner;

public class q5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String num = myobj.nextLine();
		int n = Integer.parseInt(num);
		if (n > 0) 
			System.out.println("Positive number");
		else if (n < 0)
			System.out.println("Negative number");
		else 
			System.out.println("The number is 0.");
	}
}