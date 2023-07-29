package Assignn;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class date_calcs{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateStr = scanner.nextLine();
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateStr = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateStr);
        LocalDate secondDate = LocalDate.parse(secondDateStr);
        Period duration = Period.between(firstDate, secondDate);
        int years = duration.getYears();
        int months = duration.getMonths();
        int days = duration.getDays();

        System.out.println("Duration: " + years + " years, " + months + " months, and " + days + " days.");

        scanner.close();
    }
}
