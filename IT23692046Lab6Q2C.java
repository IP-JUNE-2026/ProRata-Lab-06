import java.util.Scanner;

public class IT23692046Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sum = 0.0;
        int totalNumbers = 10;

        System.out.println("Enter 10 numbers:");

        // Use a while loop to accept 10 numbers and accumulate their sum
        while (count <= totalNumbers) {
            double number = scanner.nextDouble();
            sum += number;
            count++;
        }

        // Calculate the average
        double average = sum / totalNumbers;

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Average: %.2f\n", average);

        scanner.close();
    }
}