import java.util.Scanner;

public class IT22091802Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 1;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = scanner.nextInt();
            sum += numbers[i - 1];
            i++;
        }

        System.out.print("The numbers you entered are:\n");
        for (int j = 0; j < 10; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        double average = (double) sum / 10;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}