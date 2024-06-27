import java.util.GregorianCalendar;

public class CurrentDate {
    public static void main(String[] args) {
        // Create an instance of GregorianCalendar for the current date
        GregorianCalendar calendar = new GregorianCalendar();
        
        // Get the current year, month, and day
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Months are 0-based, so add 1
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        
        // Display the current year, month, and day
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
