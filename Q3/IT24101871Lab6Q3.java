import java.util.Scanner; 

	public class IT24101871Lab6Q3 { 
	 public static void main(String[] args) { 

	     Scanner input = new Scanner(System.in); 
	     int count = 0; 
	     double sum = 0; 
	     int num; 

	while (true) { 
	   System.out.print("Enter a number: "); 
	   num = input.nextInt(); 

	   if (num == -99) { 
	       break;

	  } else if (num > 0) { 
	     sum = sum + num * num;
	    count++; 

	  } else { 
	     System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
	} 

} 

	System.out.println();

 	  if (count == 0) {
 	     System.out.println("No valid numbers entered. Cannot calculate RMS."); 
	  } else { 
	     double rms = Math.sqrt(sum / count); 
	     System.out.println("The Root Mean Square (RMS) is: " + rms);



  	} 


   } 



}






