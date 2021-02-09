package classproject;

import java.util.Scanner;

public class P02_Factorial {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your n value for finding factorial: ");
    int n = scan.nextInt();
    System.out.println(fact(n));
}

public static long fact(int n) {
    long factorial = 1;
    for (int i = n; i > 0; i--) {
        factorial *= i;
    }

    return factorial;
}

}
