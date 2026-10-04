import java.util.Scanner;
public class IT24103255Lab6Q1{
	public static void main (String[] args){
		double number, sqrt, sqr;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = num.nextDouble();
		
		sqr = number*number;
		sqrt = Math.sqrt(number);
		
		System.out.println("The square of " + number + " is : " + sqr);
		System.out.println("The square root of " + number + " is : " + sqrt);
	}
}