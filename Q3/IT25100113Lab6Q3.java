import java.util.Scanner;

	public class IT25100113Lab6Q3 {
		public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter positive integers (terminate input with -99): ");
		
		int n , square, count = 0, total = 0;
		
		while (true) {
			System.out.print("Enter a number: ");
			n = input.nextInt();
			
			if (n==-99) {
				break;
			}
			
			if (n<0) {
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
				continue;
			} 
			
			square = n*n;
			total = total + square; 
			count++;
			
			
		}
		double rms = Math.sqrt(total/count);
		System.out.println("The Root Mean Square (RMS) is: " + rms);
		}
	}