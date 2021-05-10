
package CoreJava;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your value for array size : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.print("Enter n value for arrays " + i + " positon: ");
        arr[i] = scan.nextInt();
    }
        //calling Methods
      sort(arr);  
    }
    
    //Printing array value in reverse order
  public static void sort(int[] n) {
    for (int i = n.length - 1; i >= 0; i--) {
        System.err.println(n[i] + " ");
    }
}  
    
}
