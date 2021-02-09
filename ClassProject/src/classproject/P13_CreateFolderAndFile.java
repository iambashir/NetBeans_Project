package classproject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class P13_CreateFolderAndFile {

   public static void main(String args[]) {
       
      //Creatinig folder in a drive
//      System.out.println("Enter the path to create a directory: ");
//      Scanner sc = new Scanner(System.in);
//      String path = sc.next();
//      System.out.println("Enter the name of the desired a directory: ");
//      path = path+sc.next();
//      //Creating a File object
//      File file = new File(path);
//      //Creating the directory
//      boolean bool = file.mkdir();
//      if(bool){
//         System.out.println("Directory created successfully");
//      }else{
//         System.out.println("Sorry couldn’t create specified directory");
//         
//      }
//      
      
       
             // Creating text file
// try {  
//      File myObj = new File("F:\\Hellow\\filename.txt");  
//      if (myObj.createNewFile()) {  
//        System.out.println("File created: " + myObj.getName());  
//        System.out.println("Absolute path: " + myObj.getAbsolutePath());  
//      } else {  
//        System.out.println("File already exists.");  
//      }  
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//    }  
      
       
        // Write any text in a .text file
      
try{    
    try (FileWriter fw = new FileWriter("F:\\Hellow\\filename.txt")) {
        fw.write("Welcome to our Land. I am Bashir Hossain");
    }    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");  
      
      
      
      
      
      
      
      
      
   }
}
