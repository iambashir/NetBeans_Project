
package basicjava;

import java.util.Scanner;

public class Example {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your value :");
       int age = scan.nextInt();
       //age = 14;
      assert age <= 18 : "Cannot Vote";
      System.out.println("The voter's age is " + age);
   }
}