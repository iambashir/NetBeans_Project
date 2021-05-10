
package CoreJava;

import java.util.Scanner;

public class FactorialNumber {
    
    public static void main(String[] args) {
        //Creat a Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n  = scan.nextInt();
       
        //Display the value
       System.out.println("Factorial number is :" + fact(n));
    }
    
public static long fact(int n) {
    long factorial = 1;
    for (int i = n; i > 0; i--) {
        factorial *= i;
    }

    return factorial;
}    
    
}
