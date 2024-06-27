import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        if (number > 0 || number < 1000){
            int sum = 0;
            while (number >0){
                sum += number % 10;
                number /=10;
            }
            System.out.println("The sum of the digits is: " + sum);
        }else{
            System.out.println("The number is out of range. Please enter a number between 0 and 1000.");
        }
        scanner.close();
}
}
