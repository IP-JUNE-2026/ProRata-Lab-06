import java.util.Scanner;
public class IT24102666Lab6Q1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double num;
        double num_square;
        double num_square_root;

        System.out.println("Enter a Number: ");
        num = input.nextDouble();

        num_square = num * num;
        num_square_root = Math.sqrt(num);

        System.out.println("The Square of " + num + " is: " + num_square);
        System.out.println("The Square Root of " + num + " is: " + num_square_root);

    }
}