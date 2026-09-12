import java.util.Scanner;

public class IT26101326Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        double square = Math.pow(num, 2);
        double squareRoot = Math.sqrt(num);

        System.out.println();
        System.out.println("The square of " + num + " is : " + square);
        System.out.println("The square root of " + num + " is : " + squareRoot);

        input.close();
    }
}