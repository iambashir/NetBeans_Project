
package CoreJava;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        
        //Create a Scanner to get a value from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int gpaMarks = scan.nextInt();
        
        //Apply Condition for gpa, valid and invalid marks
        if (gpaMarks >100 || gpaMarks <0 ) System.out.println("Invalid Marks");
        else  if (gpaMarks >=80) System.out.println("GPA : A+");
        else if(gpaMarks>=70) System.out.println("GPA : A");
        else if(gpaMarks>=60) System.out.println("GPA : A-");
        else if(gpaMarks>=50) System.out.println("GPA : B");
        else if(gpaMarks>=40) System.out.println("GPA : C");
        else if(gpaMarks>=33) System.out.println("GPA : D");
        else  System.out.println("Fail");
    }
}
