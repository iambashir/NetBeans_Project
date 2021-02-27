
package basicjava;

import java.util.Scanner;

public class Multiplication_Number {
    public static void main(String[] args) {
        
        // Create one multiplication
        
//        Scanner scan = new Scanner(System.in);
//        int  num ; 
//        System.out.print("Enter a number to create its multiplication : ");
//        num = scan.nextInt();
//        for (int i = 1; i <= 10; i++) {
//        System.out.println(num + " X " + i + " = " + num*i);
//        }
        

        // Create multiple multiplication
        
        Scanner scan = new Scanner(System.in);
        int starts, ends;
        
        System.out.print("Enter starting value : ");
        starts = scan.nextInt();
        
        System.out.print("Enter ending value : ");
        ends = scan.nextInt();
        
        System.out.println(""); //line break
        
        for (int i = starts; i <= ends; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j );
            }
            System.out.println(""); //line break
        }
       
 
        
  }
}
