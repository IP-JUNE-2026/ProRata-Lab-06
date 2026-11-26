import java.util.Scanner;

public class IT23394124Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        String numbers = "";
        int i = 1;
        int sum = 0 ;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            numbers = numbers + number + " ";
            sum = sum+number;
            i++;
        }

        double avg = sum/10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);

        System.out.println("sum of the number: "+sum);
        System.out.println("Avarage of the Sum: "+avg);

        input.close();
    }
}