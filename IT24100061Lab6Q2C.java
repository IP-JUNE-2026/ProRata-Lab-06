import java.util.Scanner;
public class IT24100061Lab6Q2C {
   public static void main (String[] args) {
   
     int count=1;
	 int number;
	 double sum=0;
	 String result = "";
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Please enter 10 numbers:");
	 
	 
	 while(count<=10)
	 {
	   System.out.println("Enter number"+count+ ":");
	    number = input.nextInt();
		result = result + number + "";
	    sum = sum+number;
	   count++;
	 }
	 
	 System.out.println("The numbers you entered are:" + result);
	 
	 double average = sum/10.0;
	 System.out.println("Sum of the numbers:"+sum);
	 System.out.println("Average of the numbers:"+average);
	 
	}
 }	