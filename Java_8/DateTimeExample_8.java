package Java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//💡 date-time API: (🔹 java.time package) introduced the java.time package to replace java.util.Date.
//💡 Uses: Java 8 introduced a better date-time API, solving issues with java.util.Date.-
// -In a flight booking system, you can handle date-time operations efficiently
public class DateTimeExample_8 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + today);
        System.out.println("Current Time: " + time);
        System.out.println("Current Date & Time: " + dateTime);

    }
}
