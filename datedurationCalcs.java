package Assignn;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class datedurationCalcs {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Please enter a date in the format yyyy-MM-dd:");
	        String inputDate = sc.next();

	       
	        LocalDate userDate = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);
	        LocalDate currentDate = LocalDate.now();
	        Period duration = Period.between(userDate, currentDate);
	        int years = duration.getYears();
	        int months = duration.getMonths();
	        int days = duration.getDays();

	        System.out.println("Duration from " + userDate + " to " + currentDate + ":");
	        System.out.println("Years: " + years);
	        System.out.println("Months: " + months);
	        System.out.println("Days: " + days);

	        sc.close();
	    }
	}

