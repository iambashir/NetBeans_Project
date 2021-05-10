package CoreJava;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        
        //Create Scanner to get value from user
        Scanner scan = new Scanner(System.in);
        int sum, temp, num, r;
        System.out.println("Enter a number : ");
        num = scan.nextInt();

        sum = 0;
        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println("This is a Palindrom Number");
        } else {
            System.out.println("This is not a Palindrom Number ");
        }
    }
}
