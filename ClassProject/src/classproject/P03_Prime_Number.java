package classproject;

import java.util.Scanner;

public class P03_Prime_Number {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your n value to check Prime number: ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.println("enter n value for arrays " + i + " positon: ");
        arr[i] = scan.nextInt();
    }
    isPrime(arr);
}

//method that check prime or not and printing for each value on array
public static void isPrime(int[] n) {
    boolean b = true;
    for (int i = 0; i < n.length; i++) {
        if (n[i] == 0 || n[i] == 1) {
            System.out.println(n[i] + " is not prime number.");
        } else {
            for (int j = 2; j <= (int) n[i] / 2; j++) {
                if (n[i] % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
            System.out.println(n[i] + " is prime number.");
            } else {
            System.out.println(n[i] + " is not prime number.");
            }
            b = true;
        }
    }
}

}
