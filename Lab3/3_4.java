package Lab3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
public class 3_4 {
   public static void main(String[] args){
       String[] products = {
               "Laptop",
               "TV",
               "Headphones",
               "Camera"
       };
   Arrays.sort(products);
       System.out.println("\nSorted Product Names(asc):");
       for (String product : products) {
           System.out.println(product);
       }
       Arrays.sort(products,  Comparator.reverseOrder());
       System.out.println("\nSorted Product Names(dsc):");
       for (String product : products) {
           System.out.println(product);
       }
   }
}