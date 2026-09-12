import java.util.Scanner;

public class IT26101572Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");
        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i]);
            if (i < 9) {
                System.out.print(" ");
            }
            i++;
        }
        System.out.println();
    }
}