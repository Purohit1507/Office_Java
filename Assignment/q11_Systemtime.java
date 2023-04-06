package Assignment;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q11_Systemtime {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Format the date and time using a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        
        // Print the formatted date and time to the console
        System.out.println("Current system time in Windows: " + formattedDateTime);
        
    
    }
}
 