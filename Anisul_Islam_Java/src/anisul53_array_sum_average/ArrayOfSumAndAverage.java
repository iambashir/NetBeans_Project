
package anisul53_array_sum_average;

import java.util.Scanner;

public class ArrayOfSumAndAverage {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
       
        int[] num = new int[5];
        int  sum = 0;
        
        System.out.print("Please Enter 5 numbers : ");

        
        for (int i = 0; i < 5; i++) {
            
             num[i] = scan.nextInt();   
        }
        
        for (int i = 0; i < 5; i++) {
            
            sum = sum + num[i];
            
        }
        
       System.out.println("" + sum); 
        
    }

}
