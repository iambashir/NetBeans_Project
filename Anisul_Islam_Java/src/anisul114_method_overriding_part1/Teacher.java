
package anisul114_method_overriding_part1;

public class Teacher extends Person {
    String qualification;
    

   
    @Override
     public void displayInformation() {
    
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Qualification: " + qualification);
        
     }
}