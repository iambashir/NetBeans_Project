package classproject;

import java.util.Scanner;

public class P03a3_PrimeNumber {

public static void main(String[] args) {
    
    
    // Create a Scanner to get value from user
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = s.nextInt();
    
    //Apply if else condition
    if (isPrime(n)) {
        System.out.println(n + " is a prime number");
    } else {
        System.out.println(n + " is not a prime number");
    }
    
    
    
}

public static boolean isPrime(int n) {
    
    //if number is 0 or 1 it will be prime number (No need to check)

    if (n <= 1) {
        return false;
    }
    
    //if number is number is grater than 1 then apply this condition

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}


}
