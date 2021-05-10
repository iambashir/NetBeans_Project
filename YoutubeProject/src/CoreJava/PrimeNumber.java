package CoreJava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        // Craete a Scanner to get  value from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();

        //Apply if else condition
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

    }
    public static boolean isPrime(int n) {
        //if number is  0 or 1 it will be prime number (no need to check)
        if (n <= 1) {
            return false;
        }
        //if number is  greater than 1 then applied this condition.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
