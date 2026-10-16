import java.util.Scanner;

public class IT24103251Lab6Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        double squareRoot = Math.sqrt(number);

        System.out.println("Square of " + number + " = " + square);
        System.out.println("Square root of " + number + " = " + squareRoot);

        input.close();
    }
}