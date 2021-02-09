package bashir1259855;

import java.util.Scanner;

public class P09_Odd_Even {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your value for the size of the array: ");
    int size = scan.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
        System.out.print("enter n value for arrays " + i + " positon: ");
        arr[i] = scan.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            System.out.println(arr[i] + " is an even number.");
        } else {
            System.out.println(arr[i] + " is an odd number.");
        }
    }
}

}
