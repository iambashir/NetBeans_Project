
package CoreJava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        //Create a scanner to get value from user 
        Scanner scan = new Scanner(System.in);
        System.out.println("Write Something : ");
        String input = scan.nextLine();
        
        //getBytes() method  to convert String
        //into byte[]
        byte[] strAsByteArray = input.getBytes();
 
        //Store result in reverse order into the
        //result byte[]
        byte[] result = new byte[strAsByteArray.length];
        
       for (int i = 0; i < strAsByteArray.length; i++)
       result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
       System.out.println("Reversed value is :" + new String(result));
    } 
}
