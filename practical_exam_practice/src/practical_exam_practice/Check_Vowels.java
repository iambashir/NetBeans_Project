
package practical_exam_practice;

import java.util.Scanner;

public class Check_Vowels {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an string :");
        String s = input.nextLine();
        checkVowels(s);
    }
    static void checkVowels(String st){
        char ch;
        boolean value = true;
        for (int i = 0; i < st.length(); i++) {
            ch=st.charAt(i);
            if (ch =='a' || ch =='e' || ch =='i' || ch =='o'||ch =='u' ||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U' ) {
                System.out.println("Vowel at " + i +" is :"+ch);
                value = false;
            
            }
        }
        if ( value == true) {
            System.out.println("There is no Vowel.");
        }
    }
}
