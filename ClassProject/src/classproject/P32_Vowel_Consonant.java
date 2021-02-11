package classproject;

import java.util.Scanner;

public class P32_Vowel_Consonant {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter any charecter: ");
    String s = scan.nextLine();
    StringBuilder sBuilder = new StringBuilder();
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            sBuilder.append(s.charAt(i) + " ");
            flag = true;
        }
    }
    if (flag) {
        System.out.println("Checked vowels are: " + sBuilder);
    } else {
        System.out.println("There is no vowel in '" + s + "'");
    }
}
}
