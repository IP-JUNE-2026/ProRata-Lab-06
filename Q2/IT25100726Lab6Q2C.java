import java.util.Scanner;

public class IT25100726Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            sum = sum + num;

            i++;
        }

        double average = (double) sum / 10;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}