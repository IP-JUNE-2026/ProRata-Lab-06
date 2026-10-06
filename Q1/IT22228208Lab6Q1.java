import java.util.Scanner;

public class IT22228208Lab6Q1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a number : ");
		double number = scanner.nextDouble();

        System.out.println();
        System.out.println("The square of " +number + "is " + (number * number));
        System.out.println("The sqaure root of " + number + "is " + Math.sqrt(number));
		
		
		scanner.close();
		
		
		
	}
	
	
	
	
	
	
}