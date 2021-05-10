
package CoreJava;

import java.util.Scanner;

public class Sum_m_to_n_Numbers {
    public static void main(String[] args) {
        
        //Create Scanner
        Scanner scan = new Scanner(System.in);
        int starts, ends, sum ;
        sum = 0;
        
        System.out.print("Enter Starting value : ");
        starts = scan.nextInt();
        
        System.out.print("Enter ending value : ");
        ends = scan.nextInt();
        System.out.println("");//Line braek
        
         for (int i = starts; i <= ends; i++) {
            
         sum = sum + i;
        }
        System.out.println( "The sum is : " + sum); 
    }
}
