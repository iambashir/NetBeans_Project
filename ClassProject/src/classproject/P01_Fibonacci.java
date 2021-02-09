package classproject;

import java.util.Arrays;
import java.util.Scanner;


public class P01_Fibonacci {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your n value to check fibonacchi: ");
    int n = scan.nextInt();
    System.out.println(Arrays.toString(fib(n)));
}

public static int[] fib(int n) {
    int[] arr = new int[n + 1];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i <= n; i++) {
        arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr;
}

}
