//Programming Concepts
//==> Data types/ Variables
//==> Methods 
//==> Control Flow
//==>  Loops 
//==> Array 
//==> Object & Classes


package classproject;
import java.util.*;
        
public class P30_Trainee {
    
    
//  for loop
  public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
    int rows = scan.nextInt();

    // outer loop
    for (int i = 1; i <= rows; i++) {

      // inner loop to print the numbers
      for (int j = 1; j <= i; ++j) {
        System.out.print("*" + "");
      }
      System.out.println(" ");
    }
   

    // outer loop
    for (int i = 0; i<rows-1; i++) {

      // inner loop to print the numbers
      for (int j = rows-1; j > i; j--) {
        System.out.print("*" + "");
      }
      System.out.println(" ");
    }
    
//        // outer loop
//    for (int i = 4; i<5; i++) {
//
//      // inner loop to print the numbers
//      for (int j = 5; j >= i; j--) {
//        System.out.print("*" + "");
//      }
//      System.out.println("");
//    }
    
  }

}




//Array Loop
//   public static void main(String args[]) {
//      int [] numbers = {10, 20, 30, 40, 50};
//
//      for(int x : numbers ) {
//         if( x == 30 ) {
//            break;
//         }
//         System.out.println( x );
////         System.out.print("\n");
//      }
//   }

  


