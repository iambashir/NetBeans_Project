

package bashir1259855;

import java.util.Scanner;

public class P08_Conditional_Sum {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    System.out.println("Enter value to sum but negetive number for exit: ");
    int input = scan.nextInt();
    sum += input;
    while (input >= 0) {
        //System.out.print(" ");
        input = scan.nextInt();
        sum += input;
    }

    System.out.println("total sum is: " + sum);
}

}
