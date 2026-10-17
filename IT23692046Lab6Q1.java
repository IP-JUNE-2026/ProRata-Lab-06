import java.util.Scanner;

public class IT23692046Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square of the number
        double square = number * number;

        // Display results
        System.out.println("\n--- Calculation Results ---");
        System.out.printf("The square of %.2f is %.2f\n", number, square);

        // Check if the number is non-negative before calculating the square root
        if (number < 0) {
            System.out.println("The square root cannot be calculated for negative numbers.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.printf("The square root of %.2f is %.2f\n", number, squareRoot);
        }

        scanner.close();
    }
}