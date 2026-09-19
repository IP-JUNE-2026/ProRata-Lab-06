import java.util.Scanner;

public class SquareAndSquareRoot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = Math.pow(number, 2);
        double squareRoot = Math.sqrt(number);

        System.out.println("Square = " + square);
        System.out.println("Square Root = " + squareRoot);
    }
}