import java.util.Scanner;

public class IT22908360Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Please enter 10 numbers:");

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = input.nextInt();
            count++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        count = 0;

        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
    }
}