
package basicjava;

import java.util.Scanner;

public class ArmstrongNumber {
   public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         int sum, temp, num, remainder;
         
         System.out.print("Enter a number : ");
         num = scan.nextInt();
         
        sum = 0;
        temp = num;
        
        while (temp !=0){
        remainder = temp%10;
        sum = sum + remainder * remainder * remainder;
        temp = temp/10;}
        
        
        if(num == sum)
        {System.out.println("This is a Armstrong Number");
        }else{
            System.out.println("This is not a Armstrong Number ");
        }
        
       
        
        
    }

}
