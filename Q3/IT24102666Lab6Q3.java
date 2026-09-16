import java.util.Scanner;
public class IT24102666Lab6Q3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        double num_squared;
        int count = 0;
        double sum = 0;
        double rms;

        while (true) {
            System.out.print("Enter Number " + (count + 1) + " : " );
            num = input.nextInt();

            if (num == -99) {
                break;
            } else if (num>=0) {
                num_squared = num * num;
                sum = sum + num_squared;
                count++;
                
            } else if (num < 0) {
                System.out.print("Enter Positive Number!!\n");
            } 
            
            }

        rms = Math.sqrt(sum/count);
        System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
    }
}


