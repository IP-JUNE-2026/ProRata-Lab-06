import java.util.Scanner;

public class IT23692046Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sumOfSquares = 0.0;

        System.out.println("Enter numbers (enter -99 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check for sentinel value to terminate
            if (number == -99) {
                break;
            }

            // Validate for negative input (excluding the sentinel value)
            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue; // Skip this iteration and do not count it
            }

            // Accumulate the sum of squares
            sumOfSquares += (double) number * number;
            count++;
        }

        // Check if any numbers were entered before termination
        if (count == 0) {
            System.out.println("\nNo numbers were entered to calculate RMS.");
        } else {
            // Calculate Root Mean Square: sqrt( (sum of x^2) / N )
            double meanOfSquares = sumOfSquares / count;
            double rms = Math.sqrt(meanOfSquares);

            // Display results
            System.out.println("\n--- Root Mean Square (RMS) Result ---");
            System.out.println("Total numbers entered: " + count);
            System.out.printf("Root Mean Square:      %.4f\n", rms);
        }

        scanner.close();
    }
}