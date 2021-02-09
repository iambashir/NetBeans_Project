package classproject;
import java.util.Scanner;
public class P13_MaxMinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter 1st number  : ");
        int i = scan.nextInt();
        System.out.println(" Enter 1st number : ");
        int j = scan.nextInt();
        System.out.println(" Enter 2nd number : ");
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
