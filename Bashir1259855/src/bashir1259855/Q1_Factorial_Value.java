package bashir1259855;

import java.util.Scanner;

public class Q1_Factorial_Value {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your value to check factorial: ");
    int n = scan.nextInt();
    System.out.println("Factorial value is : " + fact(n));
}

public static long fact(int n) {
    long factorial = 1;
    for (int i = n; i > 0; i--) {
        factorial *= i;
    }

    return factorial;
}

}
