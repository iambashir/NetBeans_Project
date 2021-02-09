package classproject;

import java.util.Scanner;

public class P16a2_GradingSystem2 {

public static void main(String[] args) {

    //Class Test 1
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Your  first class test marks within 50 : ");
    double classTestMarks1 = scan.nextDouble();
    while (classTestMarks1 < 0 || classTestMarks1 > 50) {
        System.out.println("You must have to enter number within 0 to 50 : ");
        classTestMarks1 = scan.nextDouble();
    }

    //Class Test 2 
    System.out.println("Enter Your  Second class test marks within 50 : ");
    int classTestMarks2 = scan.nextInt();

    //Total class test marks
    double mainClassTestMarks = (classTestMarks1 + classTestMarks2) * 20 / 100;

    //Attendence
    System.out.println("Enter Your  Attendence within 365 : ");
    int attendence = scan.nextInt();
    double classAttendence = attendence * 10 / 100;  // 60 days per Year

    //Quiz Test Marks
    System.out.println("Enter Your  first quiz test marks  within 20: ");
    int quizTest1Marks1 = scan.nextInt();
    System.out.println("Enter Your  second quiz test marks within 20: ");
    int quizTest1Marks2 = scan.nextInt();
    double finalQuizTestMarks = (quizTest1Marks1 + quizTest1Marks2) * 10 / 100;

    // Final Marks
    System.out.println("Enter Your  Average Sub Marks within 100: ");
    int avsubMarks = scan.nextInt();
    double finalMarks = avsubMarks * 80 / 100;        //  65 marks out of 100
    double gpaMarks = finalQuizTestMarks + finalMarks + mainClassTestMarks + classAttendence;
    System.out.println("Students Final Marks : " + gpaMarks);

    if (gpaMarks > 100 || gpaMarks < 0) {
        System.out.println("Invalid Marks");
    } else if (gpaMarks >= 80) {
        System.out.println("GPA : A+");
    } else if (gpaMarks >= 70) {
        System.out.println("GPA : A");
    } else if (gpaMarks >= 60) {
        System.out.println("GPA : A-");
    } else if (gpaMarks >= 50) {
        System.out.println("GPA : B");
    } else if (gpaMarks >= 40) {
        System.out.println("GPA : C");
    } else if (gpaMarks >= 33) {
        System.out.println("GPA : D");
    } else {
        System.out.println("Fail");
    }

}

}
