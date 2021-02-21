
package Methode_Overriding;

public class Teacher extends Person {
    String Qualification;
    
    
    @Override
   void diplayInformation(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age );
        System.out.println("Qualificatio : " + Qualification);
        
    }

}
