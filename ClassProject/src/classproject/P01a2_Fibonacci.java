package classproject;
import java.util.Scanner;
public class P01a2_Fibonacci {

 /** Main method */
 public static void main(String[] args) {
     
// Create a Scanner
 Scanner scan = new Scanner(System.in);
 System.out.print("Enter value to check Fabonacci number: ");
 int n = scan.nextInt();

 // Find and display the Fibonacci number
 System.out.println("The Fibonacci number of input value is: " + fib(n));
 }

 /** The method for finding the Fibonacci number */
 public static long fib(long n) {
 if (n == 0) // Base case
 return 0;

 else if (n == 1) // Base case
 return 1;
 else // Reduction and recursive calls
 return fib(n - 1) + fib(n - 2);

}
}
