package classproject;
import java.lang.*;
import java.io.*;
import java.util.*;
 
// Class of ReverseString
class P26_ReverseString {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Write something : ");
        
        String input = scan.nextLine();
 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println("Reversed value is :" + new String(result));
    }
}