import java.util.Scanner;

public class IT21112164Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int num;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            numbers = numbers + num + " ";

            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
    }
}