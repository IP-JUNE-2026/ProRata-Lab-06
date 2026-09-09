import java.util.Scanner;

public class  it24102787lab6q3 {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Variables
        double sum = 0, num = 0, rms = 0;
        int counter = 0;

        while (true) {
            System.out.print("Enter a number: ");
            num = input.nextDouble();

            // Check for termination condition
            if (num == -99) {
                break;
            } else if (num < 0) {
                System.out.println("Invalid input. Please enter a positive number or -99 to terminate:");
            } else {
                // Add to sum
                sum += (num * num);

                // Increment counter
                counter++;
            }
        }

        // Calculate Root Mean Square (RMS)
        if (counter > 0) {  // Prevent division by zero
            rms = Math.sqrt(sum / counter);

            // Output the result
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        // Close the scanner
        input.close();
    }
}