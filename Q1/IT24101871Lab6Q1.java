import java.util.Scanner;

	public class IT24101871Lab6Q1 {
		public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
                double number,squareNum,squareRNum;
		 System.out.print("Enter a number :");

		number=input.nextDouble();
		
		squareNum=Math.pow(number,2);
		squareRNum=Math.sqrt(number);

	System.out.println("The square of"+number+"is :"+squareNum);
	System.out.println("The square root of"+number+"is :"+squareRNum);

	}

}