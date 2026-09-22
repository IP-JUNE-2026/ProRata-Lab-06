import java.util.Scanner;

  public class IT26101614Lab6Q1{
    public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   
	   double square,squareroot,number;
	   
	   System.out.println("Enter a number:");
	   number = input.nextDouble();
	   
	   if(number >= 0){
		   square = number*number;
		   System.out.println("The square of " + number +" "+ "is : " + square);
		   
		   squareroot = Math.sqrt(number);
		   System.out.println("The squareroot of " + number +" "+ "is : " + squareroot);
	   }
	   
		else{
			System.out.println("Enter a positive number:");
			double positivenumber = input.nextDouble();
		}
	}
  }