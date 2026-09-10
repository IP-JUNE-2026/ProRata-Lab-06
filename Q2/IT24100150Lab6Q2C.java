import java.util.Scanner;

public class IT24100150Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredNumbers = "";
		int count;
		int sum;
		double average;
		
		
        sum = 0;
        count = 1;

        System.out.println("Please enter 10 numbers:");
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = scanner.nextInt();
            
            
            enteredNumbers += number + " ";
            sum += number;
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(enteredNumbers);
        
        average = sum / 10.0;
        
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
    }
}