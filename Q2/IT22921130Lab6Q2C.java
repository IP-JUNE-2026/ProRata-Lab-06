import java.util.Scanner;

public class IT22921130Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, count = 1, sum = 0;
        double average;

        while (count <= 10) {

            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            sum = sum + number;

            count++;
        }

        average = (double) sum / 10;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

