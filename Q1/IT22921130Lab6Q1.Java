import java.util.Scanner;

public class  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number, square, squareRoot;

        System.out.print("Enter a number: ");
        number = input.nextDouble();IT22921130Lab6Q1

        square = number * number;
        squareRoot = Math.sqrt(number);

        System.out.println("Square = " + square);
        System.out.println("Square Root = " + squareRoot);
    }
}