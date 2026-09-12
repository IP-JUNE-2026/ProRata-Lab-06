import java.util.Scanner;

public class IT26101519Lab6Q2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");
        int i = 0;
        while(i < 10) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;
        }

        System.out.println("\nThe numbers you entered are:");
        i = 0;
        while(i < 10) {
            System.out.print(arr[i] + " ");
            i++;
        }

        double average = (double)sum / 10;
        System.out.println("\n\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        sc.close();
    }
}