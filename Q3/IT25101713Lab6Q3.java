import java.util.Scanner;
public class IT25101713Lab6Q3{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int count=0, number;
        double rootMeanSquare, sumofSquares=0;

        System.out.println("Enter positive integers (terminate input with -99)");
        
        while(true){
            System.out.print("Enter a number: ");
            number=input.nextInt();

            if(number==-99){
                break;
            }
            else if(number<0){
                System.out.println("Invalied input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumofSquares += Math.pow(number, 2);
            count++;
            
        }

        System.out.println(" ");

        if(count>0){
            rootMeanSquare = Math.sqrt(sumofSquares / count);
            System.out.print("The Root Mean Square (RMS) is: " +rootMeanSquare);

        }
        else{
            System.out.println("No valid number entered.");
        }
		
	}
}
	
