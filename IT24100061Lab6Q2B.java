import java.util.Scanner;
public class IT24100061Lab6Q2B {
   public static void main (String[] args) {
   
     int count=1;
	 int number;
	 String result = "";
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Please enter 10 numbers:");
	 
	 
	 while(count<=10)
	 {
	   System.out.println("Enter number"+count+ ":");
	    number = input.nextInt();
		result = result + number + "";
	   count++;
	 }
	 
	 System.out.println("The numbers you entered are:" + result);
	 
	 
	 
	 
	}
 }	