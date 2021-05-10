
package CoreJava;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        //Create a Scanner to get value from user
        Scanner scan = new Scanner(System.in);        
        char ch;
        System.out.print("Enter any Charecter : ");
        ch = scan.next().charAt(0);
        
        //Apply Condition for small letter and capital letter
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
           ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
           ch == 'u' || ch == 'U'){
           System.out.println("The charecter is : Vowel");
        }else{
           System.out.println("The charecter is : consonant");
        }
 
    }
    
}
