package Assignn;
import java.time.LocalDate;
import java.time.Period;

public class Warrantycalcs {
        public static LocalDate calculateWarrantyExpiration(LocalDate purchaseDate, int months, int years) {
        LocalDate expirationDate = purchaseDate.plus(Period.ofYears(years)).plus(Period.ofMonths(months));
        return expirationDate;
    }

    public static void main(String[] args) {
        LocalDate purchaseDate = LocalDate.of(2023, 07, 25);
        int warrantyMonths = 6;
        int warrantyYears = 2;  

        LocalDate warrantyExpirationDate = calculateWarrantyExpiration(purchaseDate, warrantyMonths, warrantyYears);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Warranty Expiration Date: " + warrantyExpirationDate);
    }
}
