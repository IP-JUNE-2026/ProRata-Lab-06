import java.util.Scanner;
public class IT24102666Lab6Q2B {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	    int num;
			String numbers = "";
	    int n = 1;

			System.out.println("\nPlease Enter 10 Numbers : \n");

			while (n<=10) {
				System.out.print("Please Enter Number " + n + " : ");
				num = input.nextInt();
				numbers = numbers + num + " ";
				n = n + 1;
			}

			System.out.println("\nThe Numbers You Entered Are : ");
			System.out.println(numbers + "\n");

		}

}