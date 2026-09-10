import java.util.Scanner;

public class IT24100150Lab6Q1{
	public static void main(String[] args){
		
		double number;
		double square;
		double squareRoot;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = scanner.nextDouble();
		
		System.out.println();
		
		square = number * number;
		squareRoot = Math.sqrt(number);
		
		System.out.println("The square of " + number + " is: " + square);
		System.out.print("The square root of " + number + " is: " + squareRoot);
	}
}