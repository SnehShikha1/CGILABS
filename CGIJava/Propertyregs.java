import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PropertyRegistration
{
  private String typeOfProperty;
  private int area;
  private String location;
  private double expectedPrice;
  private String sellerName;

  private static final Set < String > VALID_PROPERTY_TYPES =
    new HashSet <> (Set.of ("estate", "house", "flat", "office"));

  public PropertyRegistration (String typeOfProperty, int area,
			       String location, double expectedPrice,
			       String sellerName)
  {
    this.typeOfProperty = typeOfProperty;
    this.area = area;
    this.location = location;
    this.expectedPrice = expectedPrice;
    this.sellerName = sellerName;
  }

  public boolean validateData ()
  {
    if (!isValidTypeOfProperty (typeOfProperty))
      {
	displayValidationError ("Invalid type of property.");
	return false;
      }

    if (area <= 0 || area > 999999)
      {
	displayValidationError ("Invalid area value.");
	return false;
      }

    if (location.isEmpty ())
      {
	displayValidationError ("Location cannot be empty.");
	return false;
      }

    if (expectedPrice < 0)
      {
	displayValidationError ("Invalid expected price value.");
	return false;
      }

    if (sellerName.isEmpty ())
      {
	displayValidationError ("Seller name cannot be empty.");
	return false;
      }

    return true;
  }

  private boolean isValidTypeOfProperty (String typeOfProperty)
  {
    return VALID_PROPERTY_TYPES.contains (typeOfProperty.toLowerCase ());
  }

  private void displayValidationError (String errorMessage)
  {
    System.out.println ("Error: " + errorMessage);
  }

  private static String getUserInput (Scanner scanner, String message)
  {
    System.out.print (message);
    return scanner.nextLine ();
  }

  // Test case for property registration using user input
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

    String typeOfProperty = getUserInput (scanner,
					  "Enter type of property (estate, house, flat, office): ");

    int area = Integer.parseInt (getUserInput (scanner, "Enter area: "));

    String location = getUserInput (scanner, "Enter location: ");

    double expectedPrice =
      Double.parseDouble (getUserInput (scanner, "Enter expected price: "));

    String sellerName = getUserInput (scanner, "Enter seller name: ");

    PropertyRegistration property =
      new PropertyRegistration (typeOfProperty, area, location, expectedPrice,
				sellerName);
    if (property.validateData ())
      {
	System.out.println ("Property registration successful!");
	// Additional code to save the data or perform further actions.
      }
    else
      {
	System.out.println
	  ("Property registration failed. Please correct the errors.");
      }

    scanner.close ();
  }
}
