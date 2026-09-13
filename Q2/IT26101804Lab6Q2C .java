import java.util.Scanner;

public class IT26101804Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;
        int sum = 0;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (number <= 10) {
            System.out.print("Enter number " + number + ": ");
            int value = input.nextInt();

            numbers = numbers + value + " ";
            sum = sum + value;

            number++;
        }

        double average = sum / 10.0;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);

        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}