import java.util.Scanner;
public class  IT25101713Lab6Q2C{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
			int sum, number1,number2,number3,number4,number5,number6,number7,number8,number9,number10;
			double avg;
			
			System.out.println(" PLease Enter 10 number :");
			
			System.out.print("Enter number1 :");
			number1=input.nextInt();
			
			System.out.print("Enter number2 :");
			number2=input.nextInt();
			
			System.out.print("Enter number3 :");
			number3=input.nextInt();
			
			System.out.print("Enter number4 :");
			number4=input.nextInt();
			
			System.out.print("Enter number5 :");
			number5=input.nextInt();
			
			System.out.print("Enter number6 :");
			number6=input.nextInt();
			
			System.out.print("Enter number7 :");
			number7=input.nextInt();
			
			System.out.print("Enter number8 :");
			number8=input.nextInt();
			
			System.out.print("Enter number9 :");
			number9=input.nextInt();
			
			System.out.print("Enter number10 :");
			number10=input.nextInt();
			
			System.out.println(" ");
			
			System.out.println("The numbers you entered are: ");
			System.out.print(number1+ " ");
			System.out.print(number2+ " ");
			System.out.print(number3+ " ");
			System.out.print(number4+ " ");
			System.out.print(number5+ " ");
			System.out.print(number6+ " ");
			System.out.print(number7+ " ");
			System.out.print(number8+ " ");
			System.out.print(number9+ " ");
			System.out.println(number10+ " ");
			
			System.out.println(" ");
			
			sum=number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;
			System.out.println("sum of the numbers :" +sum);
			
			avg=sum/10.0;
			System.out.println("Average of the number :" +avg);
			
			
	}
}