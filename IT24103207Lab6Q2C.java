import java.util.Scanner;

public class IT24103207Lab6Q2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double sum = 0;
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextInt();
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / 10));
    }
}
