package classproject;
import java.util.Scanner;
public class P23_OddEvenNumber {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // prompt
    System.out.println("Enter ur number : " ); // prompt massage
    int number = input.nextInt(); // promt value
    
    if(number%2==0){
        System.out.println(" The given number is : Even");
    }else{System.out.println("The given number is : Odd");
    
    }
}

}
