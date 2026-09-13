import java.util.Scanner;

public class IT26101804Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (number <= 10) {
            System.out.print("Enter number " + number + ": ");
            int value = input.nextInt();

            numbers = numbers + value + " ";

            number++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);
    }
}