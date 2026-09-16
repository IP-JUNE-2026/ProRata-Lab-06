import java.util.Scanner;

  public class IT26101614Lab6Q3{
    public static void main(String[]args){
	   Scanner input = new Scanner(System.in);
	   
	   int num;
	   int count = 0;
	   double rms,square,sumofsquare = 0;
	   
	   System.out.println("Enter positive integers(terminate input with -99):");
	   
	   while(true){
	   
	     System.out.print("Enter a number: ");
		 num = input.nextInt();
		 
		 if(num == -99){
		 break;
		 }
		 
		 if(num < 0){
			 System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
		 }

         else{
			 square = num * num;
			 sumofsquare += square;
			 count++;
		 }
	   }
	   
		 if(count > 0){
			 rms = Math.sqrt(sumofsquare/count);
			 
			 System.out.println("\nThe root Mean Square (RMS) is: " + rms);
		 }
			 
		else{ 
   		     System.out.println("\nNo valid numbers were entered");
		}
			 
		 
	   
  }
  
  }
	   