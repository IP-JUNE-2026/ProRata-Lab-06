import java.util.Scanner;

public class IT26101519Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Please enter 10 numbers:");
        int i = 0;
        while(i < 10) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("\nThe numbers you entered are:");
        i = 0;
        while(i < 10) {
            System.out.print(arr[i] + " ");
            i++;
        }
        sc.close();
    }
}