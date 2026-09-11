import java.util.Scanner;

public class IT26101915Lab6Q2B{

    public static void main(String[]args){
	
	  int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
	  double average;
	  
	        int sum = 0;
	  
	  Scanner input= new Scanner(System.in);
	  
	  System.out.println("Please enter 10 numbers: ");
	  
	  System.out.print("Enter number 1 : ");
	  num1=input.nextInt();
	     sum+=num1;
	  
	  System.out.print("Enter number 2 : ");
	  num2=input.nextInt();
	      sum+=num2;
	  
	  System.out.print("Enter number 3 : ");
	  num3=input.nextInt();
	       sum+=num3;
		   
	  System.out.print("Enter number 4 : ");
	  num4=input.nextInt();
	        sum+=num4;
			
	  System.out.print("Enter number 5 : ");
	  num5=input.nextInt();
	        sum+=num5;
			
	  System.out.print("Enter number 6 : ");
	  num6=input.nextInt();
	        sum+=num6;
			
	  System.out.print("Enter number 7 : ");
	  num7=input.nextInt();
	         sum+=num7;
			 
	  System.out.print("Enter number 8 : ");
	  num8=input.nextInt();
	         sum+=num8;
			  
	  System.out.print("Enter number 9 : ");
	  num9=input.nextInt();
	         sum+=num9;
			 
	  System.out.print("Enter number 10 : ");
	  num10=input.nextInt();
	         sum+=num10;
	 
	  average=sum/10.0;
	  
	      System.out.println();
	  System.out.println("The numbers you enterd are: ");
	  System.out.print(num1+ "  ");
	  System.out.print(num2+ "  ");
	  System.out.print(num3+ "  ");
	  System.out.print(num4+ "  ");
	  System.out.print(num5+ "  ");
	  System.out.print(num6+ "  ");
	  System.out.print(num7+ "  ");
	  System.out.print(num8+ "  ");
	  System.out.print(num9+ "  ");
	  System.out.print(num10+ "  ");
	       
		   System.out.println();
		   System.out.println();
	  System.out.println("Sum of the numbers: "+sum);
	  System.out.println("Average of the numbers: "+average);
    }
}
	  
	  