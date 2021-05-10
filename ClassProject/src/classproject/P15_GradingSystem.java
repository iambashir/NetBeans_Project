package classproject;
//import java.util.Scanner;

import java.util.Scanner;

public class P15_GradingSystem {

public static void main(String[] args) {
//    
//    long first = System.currentTimeMillis();
//    
//    double classTestMarks = (45 + 45)* 20/100; // 2 class test out of 50 number
//   double  attendence = 60 * 10/100;           // 60 days per Year
//   double quizTest =  (15 + 15)*10/100 ;      // 2 Quiz test out of 20 marks  
//   
//   double  finalMarks = 60 * 80/100;        //  65 marks out of 100
//   
//    
//   
//   double gpaMarks = classTestMarks + attendence + quizTest + finalMarks;
//   
//    System.out.println("Students Final Marks : " + gpaMarks);
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Your Marks : ");
     int gpaMarks = scan.nextInt();
     
     if (gpaMarks >100 || gpaMarks <0 ) System.out.println("Invalid Marks");
    else  if (gpaMarks >=80) System.out.println("GPA : A+");
    else if(gpaMarks>=70) System.out.println("GPA : A");
    else if(gpaMarks>=60) System.out.println("GPA : A-");
    else if(gpaMarks>=50) System.out.println("GPA : B");
    else if(gpaMarks>=40) System.out.println("GPA : C");
    else if(gpaMarks>=33) System.out.println("GPA : D");
    else  System.out.println("Fail");
     
     
//     long second = System.currentTimeMillis();
//     System.out.println(second-first);
     
     
}

}
