import java.util.Scanner;

public class IT23394124Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        String numbers = "";
        int i = 1;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            numbers = numbers + number + " ";
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);

        input.close();
    }
}