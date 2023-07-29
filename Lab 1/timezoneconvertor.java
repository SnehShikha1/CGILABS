package Assignn;


//import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class timezoneconvertor {

          public static void printCurrentDateTimeInZone(String zoneId) {
              try {
                  ZoneId zone = ZoneId.of(zoneId);
                  ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
                  
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                  String formattedDateTime = zonedDateTime.format(formatter);
                  
                  System.out.println("Current date and time in " + zoneId + ": " + formattedDateTime);
              } catch (Exception e) {
                  System.out.println("Invalid zone ID: " + zoneId);
              }
          }

          public static void main(String[] args) {
              printCurrentDateTimeInZone("America/New_York");
              printCurrentDateTimeInZone("Europe/London");
              printCurrentDateTimeInZone("Asia/Tokyo");
              printCurrentDateTimeInZone("US/Pacific");
              printCurrentDateTimeInZone("Africa/Cairo");
              printCurrentDateTimeInZone("Australia/Sydney");
          }
      }