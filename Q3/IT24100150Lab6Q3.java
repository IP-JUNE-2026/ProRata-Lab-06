import java.util.Scanner;

public class IT24100150Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int sumOfSquares;
		int count;
		int num;
		double rms;
        
        sumOfSquares = 0;
        count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");
        
       
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        
        while (num != -99) {
            
            if (num >= 0) {
                
                sumOfSquares += (num * num);
                count++;
            } else {
                
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }

            
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }
        
        
    }
}