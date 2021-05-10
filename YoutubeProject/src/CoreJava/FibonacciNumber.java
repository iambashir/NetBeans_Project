
package CoreJava;

import java.util.Scanner;

public class FibonacciNumber {
    
    //Main method
    public static void main(String[] args) {
        //Create a Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        
        //Find an display fibonacci number
        System.out.println("The Fibonacci number is: " + fib(n));
    }
    
     public static long fib(long n) {
 if (n == 0) // Base case
 return 0;

 else if (n == 1) // Base case
 return 1;
 else // Reduction and recursive calls
 return fib(n - 1) + fib(n - 2);

}
    
}
