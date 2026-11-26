import java.util.Scanner;

public class IT23394124Lab6Q1 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the Number:");
       double number = input.nextDouble();

       double squre = Math.pow(number,2);
       double sqrt   = Math.sqrt(number);

       
       System.out.println("Squre Of" +number+"is :"+squre);
       System.out.println("Squre Root Of" +number+"is :"+sqrt);

       input.close();
    }
}