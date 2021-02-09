package classproject;

import java.util.Scanner;

public class P17_LargeNewNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter integer 1  : ");
        int i = scan.nextInt();
        System.out.println(" Enter integer 2 : ");
        int j = scan.nextInt();
        System.out.println(" Enter integer 3 : ");
        int k = scan.nextInt();

        if (i > j && i > k) {
            System.out.println("Largest is :" + i);
        } else if (j > i && j > k) {
            System.out.println("Largest is :" + j);
        } else {
            System.out.println("Largest is :" + k);
        }

        if (i < j && j < k) {
            System.out.println("Lowest is :" + i);
        } else if (j < i && j < k) {
            System.out.println("Lowest is :" + j);
        } else {
            System.out.println("Lowest is :" + k);
        }

    }
}
