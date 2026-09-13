import java.util.Scanner;

public class IT25100113Lab6Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();
		
		//calculation of square and squareroot
		double square = number*number;
		double squareroot = Math.sqrt(number);
		
		//code execution
		System.out.println("The square of "+ number + " is : " + square);
		System.out.println("The squareroot of " + number + " is : " + squareroot);
	}
}