import java.util.Scanner;

public class IT23240506Lab6Q2B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = sc.nextInt();
            numbers = numbers + num + " ";
            count++;
        }

        System.out.println("");
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);

    }
}