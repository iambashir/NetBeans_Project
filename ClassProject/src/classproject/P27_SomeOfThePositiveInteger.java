package bashirs1259855;

import java.util.Scanner;
public class P27_SomeOfThePositiveInteger {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    System.out.print("enter value to sum but '0' for exit: ");
    int input = scan.nextInt();
    sum += input;
    while (input > 0) {
        System.out.print("enter value to sum but '0' for exit: ");
        input = scan.nextInt();
        sum += input;
    }

    System.out.println("total sum is: " + sum);
}
}
