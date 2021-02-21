
package basicjava;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        char ch;
        System.out.print("Enter any Charecter : ");
        ch = scan.next().charAt(0);
        
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
           ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
           ch == 'u' || ch == 'U'){
           System.out.println("Vowel");
        }else{
           System.out.println("consonant");
        }
 
    }
    
}
