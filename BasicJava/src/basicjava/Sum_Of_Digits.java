
package basicjava;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  sum = 0, temp , remainder, num;

        System.out.print("Enter a Number : ");
        num = scan.nextInt();
        temp = num;
        
        while(temp!=0){
        remainder = temp%10;
        sum = sum + remainder;
        temp = temp/10;
        }
        System.out.print("Sum of digits : " + sum);
        System.out.println("");

    }
}
