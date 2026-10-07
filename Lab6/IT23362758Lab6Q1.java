import java.util.Scanner;

public class IT23362758Lab6Q1 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		double number;
		double square;
		double squareroot;
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		square = number * number;
		squareroot = Math.sqrt(number);
		
		System.out.println("The square of " + number + "is" + squareroot);
	}
}