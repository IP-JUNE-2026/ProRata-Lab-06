import java.util.Scanner;

public class IT22629180Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        int count = 0;
        double sumOfSquares = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumOfSquares += num * num;
            count++;
        }

        double rms = Math.sqrt(sumOfSquares / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);
    }
}
