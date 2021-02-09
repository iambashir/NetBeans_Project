package bashir1259855;

import java.util.Scanner;

public class P06_Max_Min {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the size of the array: ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.println("enter value for arrays " + i + " position: ");
        arr[i] = scan.nextInt();
    }

    //calling methods
    System.out.println("the largest value of the array is: " + findMax(arr));
    System.out.println("the lowest value of the array is: " + findMin(arr));

}

//method for finding max value from array

public static int findMax(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] >= max) {
            max = a[i];
        }
    }

    return max;
}

//method for finding min value form array

public static int findMin(int[] a) {
    int min = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] <= min) {
            min = a[i];
        }
    }
    return min;
}
}
