
package CoreJava;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        
        //Create scanner to get value from user
        Scanner scan = new Scanner(System.in);
        int starts, ends;

        System.out.print("Enter Starting value : ");
        starts = scan.nextInt();

        System.out.print("Enter ending value : ");
        ends = scan.nextInt();

        System.out.println("");//For line break

        //Apply loop for multiplication
        for (int i = starts; i <= ends; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println(""); //line break
        }
    }
}
