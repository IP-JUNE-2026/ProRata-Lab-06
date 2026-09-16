import java.util.Scanner;

public class IT21112164Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sumOfSquares = 0;
        int count = 0;
        int num;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares = sumOfSquares + (num * num);
                count++;
            }
        }

        double rms = Math.sqrt((double) sumOfSquares / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);
    }
}