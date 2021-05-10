
package CoreJava;

import java.util.Scanner;

public class ConditionalSum {

    public static void main(String[] args) {
        //Craete Scanner to get a value from user
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter value to sum but negetive number for exit : ");
        int input = scan.nextInt();
        sum += input;
        while (input >= 0) {
            input = scan.nextInt();
            if (input < 0) {
                continue;
            }
            sum += input;
        }
        System.out.println("Total sum is: " + sum);

    }

}
