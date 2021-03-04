
package practical_exam_practice;

import java.util.Scanner;

public class CheckVowelWIthOnlyMainMethod {
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter a string Value:");
              String s = input.nextLine();
              boolean value = true; 
              for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);
                  if (ch == 'a' || ch =='e' || ch =='i' || ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ) {
                      value = false;
                      System.out.println("Value is at "+ i + " is " + ch);
                  }            
        }
              if (value) {
                  System.out.println("There is no VOWEL.");
        }
    }
    
}
