package bashir1259855;

import java.util.Scanner;

public class P10_Number_with_Power {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter value for n: ");
    long n = scan.nextLong();
    System.out.print("enter value for power: ");
    long p = scan.nextLong();
    long result = 1;
    //result = Math.pow(n, p);
    for (int i = 0; i < p; i++) {
        result *= n;
    }
    System.out.print(result);
    
    
   
}
}