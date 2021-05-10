package CoreJava;

import java.util.Scanner;

public class MaxAndMinValue {

    public static void main(String[] args) {
        //Create a Scanner to get value from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " position's value: ");
            arr[i] = scan.nextInt();
        }
        
        //Calling methods
        System.out.println("Highest value is: " + findMax(arr));
        System.out.println("Lowest value is: " + findMin(arr));
    }
    
    // Methode for finding Max value for array
    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }

        return max;
    }
   // Methode for finding min value for array
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
