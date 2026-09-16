import java.util.Scanner;
public class IT24102666Lab6Q2C {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	    int num;
			int sum = 0;
			double avg;
			String numbers = "";
	    int n = 1;

			System.out.println("\nPlease Enter 10 Numbers : \n");

			while (n<=10) {
				System.out.print("Please Enter Number " + n + " : ");
				num = input.nextInt();
				numbers = numbers + num + " ";
				n = n + 1;
				sum = sum + num;
			}

			avg = sum/10;

			System.out.println("\nThe Numbers You Entered Are : ");
			System.out.println(numbers + "\n");
			System.out.println("The Sum of the entered Numbers are: " + sum + ".");
			System.out.println("The Average of the entered Numbers are: " + avg + ".");

		}

}