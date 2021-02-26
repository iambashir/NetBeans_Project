
package basicjava;

import java.util.Scanner;

public class Sum_m_to_n_numbers {
    
    public static void main(String[] args) {
        
    
        // Sum of all the numbers from m to n
        Scanner scan = new Scanner(System.in);
        int starts, ends, sum ;
        sum = 0;
        
        System.out.print("Enter starting value : ");
        starts = scan.nextInt();
        
        System.out.print("Enter ending value : ");
        ends = scan.nextInt();
        
        System.out.println(""); //line break
        
        for (int i = starts; i <= ends; i++) {
            
            sum = sum + i;
           
        }
        System.out.println( "The sum is : " + sum); 
        
        
}
}