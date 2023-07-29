package Assignn;
import java.util.Scanner;

public class Assign_Method {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);    
   System.out.println("Enter a string");
   String str=sc.nextLine();
   for (int i=1;i<str.length();i++)
  {
     char current=str.charAt(i);
     char previous=str.charAt(i-1);
     if(previous>current)
         System.out.println("false");
     else
         System.out.println("True");
   }
}
}
