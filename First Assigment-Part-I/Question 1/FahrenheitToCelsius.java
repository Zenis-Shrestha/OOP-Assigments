import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a Fahrenheit degree
        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);
        // Close the scanner
        scanner.close();
    }
}
