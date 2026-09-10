import java.util.Scanner;

public class IT24100150Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredNumbers = ""; 
        int count = 1;

        System.out.println("Please enter 10 numbers:");
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = scanner.nextInt();
            
            enteredNumbers += number + " ";
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(enteredNumbers);
        
    }
}