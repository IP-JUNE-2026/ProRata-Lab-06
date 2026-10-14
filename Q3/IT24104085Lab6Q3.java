import java.util.Scanner;
public class IT24104085Lab6Q3 {

public static void main(String[] args) {

int number ;
double meanOfSquares , rms ;

double sumOfSquares = 0 ;
int count =0;

Scanner input = new Scanner(System.in);

System.out.println("Enter positive integers (terminate imput with -99): ");

while (true) {

System.out.print("Enter a number : ");
number= input.nextInt();

if(number == -99) {
 break;
}

if(number > 0) {

sumOfSquares += Math.pow(number, 2);

count ++ ;

} else {

System.out.println("Invalid input. please enter a positive integer or -99 terminate");

}

if (count >0) {
}
}
}
}










