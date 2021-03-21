
package anisul114_method_overriding_part1;

public class Person {
    String name, address;
    

    public void displayInformation() {
    
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
   
}
}

// In overriding: Name, Signature type, parameter must be same.
// if a method cant be inherited, then it can be overriden.
// A method decleard as final or static can't be overriden;
// Contructor cant be overriden
