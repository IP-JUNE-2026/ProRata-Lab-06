import java.util.Scanner;

public class IT24103207Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (enter -99 to stop):");
        int x = sc.nextInt();
        while (x != -99) {
            if (x < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
            } else {
                sumOfSquares += (double) x * x;
                count++;
            }
            x = sc.nextInt();
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square: " + rms);
        }
    }
}
