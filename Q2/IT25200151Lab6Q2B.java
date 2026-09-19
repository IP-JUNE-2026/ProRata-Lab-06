import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            System.out.println("Number = " + number);

            i++;
        }
    }
}