import java.util.Scanner;

public class IT21112164Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int num;
        int sum = 0;
        double average;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            numbers = numbers + num + " ";
            sum = sum + num;

            i++;
        }

        average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered:");
        System.out.println(numbers);
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers:  " + average);
    }
}