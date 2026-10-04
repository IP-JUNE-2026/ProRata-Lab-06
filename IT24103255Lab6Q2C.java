import java.util.Scanner;
public class IT24103255Lab6Q2C{
	public static void main (String[] args){
		Scanner num = new Scanner(System.in);
		int counter = 0;
		int[] number = new int[10];
		int sum = 0;
		
		while(counter < 10){
			System.out.print("Enter number " + (counter+1) + ": ");
			number[counter] = num.nextInt();
			sum = sum + number[counter];
			counter = counter + 1;
		}
		
		System.out.println("You entered:");
		counter = 0;
		while(counter < 10){
			System.out.print(number[counter] + " ");
			counter= counter+1;
		}
		
		double avg = sum / 10.0;
		
		System.out.println();
		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + avg);
		
	}
}