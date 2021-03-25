
package anisul114_method_overriding_part1;

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        
        t1.name = "Bashir";
        t1.address = "Rasulpur";
        t1.qualification = "Director";
        
       t1.displayInformation();
       
       Person p1 = new Person();
       p1.name = "Hasan";
       p1.address = "Konapara";

       p1.displayInformation();
       
       
       
       
    }  
}
