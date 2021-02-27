
package basicjava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, num, temp, remainder;
        System.out.print("Enter a number : ");
        num  = scan.nextInt();
        
        temp = num;
        
        while(temp!=0){
        remainder = temp%10;
        sum = sum*10 + remainder ;
        temp = temp/10;}

        System.out.println("Reverse number is: " + sum );
        
 
        
    }
}
