import java.util.Scanner;
public class IT24103255Lab6Q3{
	public static void main (String[] args){
		Scanner x = new Scanner(System.in);
		double sum=0;
		int count = 0;
		System.out.println("Enter positive integers(terminate input with -99):");
		System.out.print("Enter a number: ");
		int num = x.nextInt();
		
		if(num > 0){
			while(num != -99){				
				System.out.print("Enter a number: ");
				num = x.nextInt();
				sum = (num*num)+sum;
				count++;
				
				if((num <= 0)&&(num != -99)){
					System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
					continue;
				}
			
			}
		}
			double meansquare = sum/count;
			double rms = Math.sqrt(meansquare);
		
			System.out.println("");
			System.out.print("The Root Mean Square (RMS) is: " + rms);
	}
}