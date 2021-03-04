package practical_exam_practice;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A String......");
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
//        System.out.println("The Reverse String Is :");
//        int j = ch.length;
//        for (int i = j; i > 0; i--) {
//            System.out.print(ch[i - 1] + " ");
//        }
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
