import java.util.Scanner;

public class IT23692046Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        System.out.println("Enter 10 numbers:");
        
        System.out.print("Output: ");
        // Use a while loop to accept 10 numbers and print them
        while (count <= 10) {
            int number = scanner.nextInt();
            System.out.print(number + " ");
            count++;
        }
        
        System.out.println();
        scanner.close();
    }
}