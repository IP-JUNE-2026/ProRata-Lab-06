import java.util.Scanner;

public class IT22921130Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, count = 1;

        while (count <= 10) {

            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            System.out.println("You entered: " + number);

            count++;
        }
    }
}