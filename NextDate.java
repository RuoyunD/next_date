import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NextDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date in the format YYYY-MM-DD:");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        // Calculate the next date
        LocalDate nextDate = date.plusDays(1);
        
        System.out.println("Entered Date: " + date);
        System.out.println("Next Date: " + nextDate);
    }
}
