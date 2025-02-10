import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class lab2_8 {
    public static void main(String[] args) {

        // Parse command-line arguments
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Define the given date and reference date (1 Jan 1970)
        LocalDate givenDate = LocalDate.of(year, month, day);
        LocalDate baseDate = LocalDate.of(1970, 1, 1);

        // Calculate the number of days between the two dates
        long daysSince1970 = ChronoUnit.DAYS.between(baseDate, givenDate);

        // Print the result
        System.out.println("Days since January 1, 1970: " + daysSince1970);
    }
}
