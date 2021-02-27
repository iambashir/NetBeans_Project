
package basicjava;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         int sum, temp, num, r;
         
         System.out.print("Enter a number : ");
         num = scan.nextInt();
         
        sum = 0;
        temp = num;
        
        while (temp !=0){
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;}
        
        
        if(num == sum)
        {System.out.println("This is a Palindrom Number");
        }else{
            System.out.println("This is not a Palindrom Number ");
        }
            
        
    }

}
