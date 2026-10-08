import java.util.Scanner;
public class IT25101713Lab6Q1{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		Double number,squre=1.0,squreRoot;
		
			System.out.print("Enter a number :");
			number=input.nextDouble();
			
			squre=number*number;
			System.out.println("The squre of 25 is :" +squre);
			
			squreRoot=Math.sqrt(number);
			System.out.println("The squre root of 25 is :" +squreRoot);
	}
}

		
		
