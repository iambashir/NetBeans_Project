package bashir1259855;

import java.util.Scanner;

public class P05_Array_Reverse {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your value for the array: ");
    int size = scan.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
        System.out.println("Enter n value for arrays " + i + " positon: ");
        arr[i] = scan.nextInt();
    }

    //calling methods
    sort(arr);
    //System.out.print(Arrays.toString(sort(arr)));
}

//Printing array value in reverse order
public static void sort(int[] n) {
    for (int i = n.length - 1; i >= 0; i--) {
        System.err.println(n[i] + " ");
    }
}

}
