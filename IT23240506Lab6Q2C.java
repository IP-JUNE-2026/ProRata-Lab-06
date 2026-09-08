import java.util.Scanner;

public class IT23240506Lab6Q2C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = sc.nextInt();
            sum = sum + num;
            numbers = numbers + num + " ";
            count++;
        }

        double avg = sum / 10.0;

        System.out.println("");
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
        System.out.println("");
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + avg);

    }
}