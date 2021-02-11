package bashir1259855;

import java.util.Scanner;

public class Q1_SumOfPosetiveNumber {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    System.out.println("Enter your value : ");
    int input = scan.nextInt();
    sum += input;
    while (input >= 0) {
        //System.out.print(" ");
        input = scan.nextInt();
        if (input < 0) {
            continue;
        }
        sum += input;
    }

    System.out.println("total sum is: " + sum);
}
}
